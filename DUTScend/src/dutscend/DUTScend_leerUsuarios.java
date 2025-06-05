package dutscend;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class DUTScend_leerUsuarios {

   private static final String ARCHIVO_SESION = "sesion.txt";
    private static final String ARCHIVO_USUARIOS = "usuarios.txt";

    /**
     * Guarda el usuario en sesión, incluyendo su saldo actualizado.
     */
    public static void guardarUsuarioSesion(String nombre, String apellido, String usuario, double saldo) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ARCHIVO_SESION, false), StandardCharsets.UTF_8))) {
            bw.write(nombre.trim() + "," + apellido.trim() + "," + usuario.trim() + "," + saldo);
            bw.newLine(); 
            bw.flush();
            System.out.println("Usuario actualizado en sesión.txt: " + usuario + " con saldo: " + saldo + " duts.");
        } catch (IOException e) {
            System.out.println("Error al actualizar sesión.txt: " + e.getMessage());
        }
    }

    /**
     * Recupera el usuario en sesión y obtiene su saldo desde `usuarios.txt`.
     * @return Saldo del usuario en sesión o `-1` si hay error.
     */
    public static double cargarSaldoDesdeUsuarios() {
        String usuarioActivo = obtenerUsuarioSesion();
        if (usuarioActivo == null) {
            System.out.println("No se pudo recuperar el usuario en sesión.");
            return -1;
        }

        String[] datosSesion = usuarioActivo.split("\n");
        String usuario = datosSesion[3].replace("Usuario: ", "").trim(); // Extrae el nombre de usuario
        
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_USUARIOS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 5 && datos[2].trim().equals(usuario)) { // Verifica usuario
                    return Double.parseDouble(datos[4].trim()); // Devuelve saldo actualizado
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer usuarios.txt: " + e.getMessage());
        }

        return -1; // Retorna -1 si hay error
    }

    /**
     * Actualiza el saldo del usuario en sesión después de una transacción.
     */
    public static void actualizarSaldoSesion(double nuevoSaldo) {
        File archivoSesion = new File(ARCHIVO_SESION);

        if (!archivoSesion.exists()) {
            System.out.println("Archivo sesión.txt no encontrado.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoSesion, StandardCharsets.UTF_8))) {
            String linea = reader.readLine();
            if (linea == null || linea.trim().isEmpty()) {
                System.out.println("Archivo sesión.txt está vacío.");
                return;
            }

            String[] datos = linea.split(",");
            if (datos.length < 4) {
                System.out.println("Error en sesión.txt: " + linea);
                return;
            }

            guardarUsuarioSesion(datos[0].trim(), datos[1].trim(), datos[2].trim(), nuevoSaldo); 
        } catch (IOException e) {
            System.out.println("Error al actualizar saldo en sesión.txt: " + e.getMessage());
        }
    }

    /**
     * Recupera los datos del usuario en sesión, incluyendo el saldo.
     */
    public static String obtenerUsuarioSesion() {
        File archivoSesion = new File(ARCHIVO_SESION);

        if (!archivoSesion.exists()) {
            System.out.println("Archivo sesión.txt no encontrado.");
            return null;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoSesion, StandardCharsets.UTF_8))) {
            String linea = reader.readLine();
            if (linea == null || linea.trim().isEmpty()) {
                System.out.println("Archivo sesión.txt está vacío.");
                return null;
            }

            String[] datos = linea.split(",");
            if (datos.length < 4) {
                System.out.println("Error en sesión.txt: " + linea);
                return null;
            }

            return "Usuario en sesión:\nNombre: " + datos[0] + "\nApellido: " + datos[1] + "\nUsuario: " + datos[2] + "\nSaldo: " + datos[3] + " duts";
        } catch (IOException e) {
            System.out.println("Error al leer sesión.txt: " + e.getMessage());
            return null;
        }
    }
}