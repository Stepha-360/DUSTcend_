package dutscend;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class moneda {

   private double valor;
    private final PropertyChangeSupport soporte;
    private static final String ARCHIVO_USUARIOS = "usuarios.txt";
    private static final String ARCHIVO_SESION = "sesion.txt"; 

    public moneda(double valorInicial) {
        this.valor = valorInicial;
        this.soporte = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        soporte.addPropertyChangeListener(listener);
    }

    public void setValor(double nuevoValor) {
        double valorAntiguo = this.valor;
        this.valor = nuevoValor;
        soporte.firePropertyChange("valor", valorAntiguo, nuevoValor);
    }

    public double getValor() {
        return valor;
    }

    /**
     * Recupera el usuario en sesión desde sesión.txt.
     * @return Usuario en sesión o `null` si no hay datos.
     */
    public static String obtenerUsuarioActivo() {
        File archivoSesion = new File(ARCHIVO_SESION);

        if (!archivoSesion.exists()) {
            System.out.println("Archivo sesión.txt no encontrado.");
            return null;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoSesion))) {
            String linea = reader.readLine();
            if (linea == null || linea.trim().isEmpty()) {
                System.out.println("Archivo sesión.txt está vacío.");
                return null;
            }

            String[] datos = linea.split(",");
            if (datos.length < 3) {
                System.out.println("Error en el formato de sesión.txt: " + linea);
                return null;
            }

            return datos[2].trim(); // Retorna solo el usuario en sesión
        } catch (IOException e) {
            System.out.println("Error al leer sesión.txt: " + e.getMessage());
            return null;
        }
    }

    /**
     * Realiza una transferencia de dinero usando el usuario en sesión como origen.
     * @param usuarioDestino Usuario que recibe el dinero.
     * @param cantidad Cantidad a transferir.
     * @return `true` si la transferencia fue exitosa, `false` si hubo un error.
     */
    public static boolean transferirDesdeSesion(String usuarioDestino, double cantidad) {
        String usuarioOrigen = obtenerUsuarioActivo();
        if (usuarioOrigen == null) {
            System.out.println("No se encontró un usuario en sesión.");
            return false;
        }

        return transferirEntreUsuarios(usuarioOrigen, usuarioDestino, cantidad);
    }

    public static boolean transferirEntreUsuarios(String usuarioOrigen, String usuarioDestino, double cantidad) {
        File archivoUsuarios = new File(ARCHIVO_USUARIOS);
        List<String> usuariosActualizados = new ArrayList<>();
        boolean transferenciaExitosa = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 5) {
                    String usuario = datos[2].trim();
                    double saldo = Double.parseDouble(datos[4].trim());

                    if (usuario.equals(usuarioOrigen)) {
                        if (saldo >= cantidad) {
                            saldo -= cantidad;
                            transferenciaExitosa = true;
                        } else {
                            System.out.println("Saldo insuficiente para la transferencia.");
                            return false;
                        }
                    }

                    if (usuario.equals(usuarioDestino)) {
                        saldo += cantidad;
                    }

                    usuariosActualizados.add(datos[0] + "," + datos[1] + "," + usuario + "," + datos[3] + "," + saldo);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de usuarios: " + e.getMessage());
            return false;
        }

        if (transferenciaExitosa) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(archivoUsuarios))) {
                for (String usuario : usuariosActualizados) {
                    pw.println(usuario);
                }
            } catch (IOException e) {
                System.out.println("Error al actualizar el archivo de usuarios: " + e.getMessage());
                return false;
            }
            System.out.println("Transferencia exitosa de " + cantidad + " duts.");
            return true;
        }
        return false;
    }
}