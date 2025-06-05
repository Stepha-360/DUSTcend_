/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dutscend;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DUTScend_usuarios {

     private String nombre;
    private String apellido;
    private String usuario;
    private double saldo;

    private static final double SALDO_INICIAL = 1000; // Instancia de 1000 duts por usuario
    private static ArrayList<DUTScend_usuarios> listaUsuarios = new ArrayList<>();

    // Constructor para nuevos usuarios: siempre asigna 1000 duts
    public DUTScend_usuarios(String nombre, String apellido, String usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.saldo = SALDO_INICIAL; // Asigna 1000 duts automáticamente
    }

    // Constructor para cargar usuarios existentes con saldo definido
    public DUTScend_usuarios(String nombre, String apellido, String usuario, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getUsuario() { return usuario; }
    public double getSaldo() { return saldo; }

    // Método para cargar usuarios desde el archivo
    public static void cargarUsuariosDesdeArchivo(String archivo) {
        listaUsuarios.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                double saldo = (datos.length == 4) ? Double.parseDouble(datos[3]) : SALDO_INICIAL; // Si no hay saldo, asignar 1000
                listaUsuarios.add(new DUTScend_usuarios(datos[0], datos[1], datos[2], saldo));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método para guardar usuarios en el archivo con saldo inicial
    public static void guardarUsuarioEnArchivo(String archivo, DUTScend_usuarios usuario) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo, true))) {
            pw.println(usuario.getNombre() + "," + usuario.getApellido() + "," + usuario.getUsuario() + "," + usuario.getSaldo());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar usuario: " + e.getMessage());
        }
    }

    // Método para mostrar todos los usuarios guardados con su saldo
    public static void mostrarUsuarios() {
        if (listaUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios guardados.");
        } else {
            StringBuilder mensaje = new StringBuilder("Usuarios guardados:\n");
            for (DUTScend_usuarios usuario : listaUsuarios) {
                mensaje.append("Nombre: ").append(usuario.getNombre())
                        .append("\nApellido: ").append(usuario.getApellido())
                        .append("\nUsuario: ").append(usuario.getUsuario())
                        .append("\nSaldo: ").append(usuario.getSaldo()).append(" duts\n\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString());
        }
    }
}