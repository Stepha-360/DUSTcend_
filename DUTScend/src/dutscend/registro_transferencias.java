package dutscend;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class registro_transferencias {
     private static final String ARCHIVO_MOVIMIENTOS = "movimientos.txt";

    /**
     * Registra una transferencia con la cantidad, usuario destino y fecha.
     * @param usuarioOrigen Usuario que envía la transferencia.
     * @param usuarioDestino Usuario que recibe la transferencia.
     * @param cantidad Cantidad transferida.
     */
    public static void registrarMovimiento(String usuarioOrigen, String usuarioDestino, double cantidad) {
        String fechaActual = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_MOVIMIENTOS, true))) {
            bw.write(fechaActual + "," + usuarioOrigen + "," + usuarioDestino + "," + cantidad);
            bw.newLine();
            bw.flush();
            System.out.println("Movimiento registrado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al registrar movimiento: " + e.getMessage());
        }
    }

    /**
     * Carga los movimientos desde el archivo y los muestra en una JTable.
     * @param tabla JTable donde se mostrarán los movimientos.
     */
    public static void cargarMovimientosEnTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // Limpia la tabla antes de cargar nuevos datos

        File archivo = new File(ARCHIVO_MOVIMIENTOS);
        if (!archivo.exists()) {
            System.out.println("No hay movimientos registrados.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length == 4) {
                    Vector<String> fila = new Vector<>();
                    fila.add(datos[0]); // Fecha
                    fila.add(datos[1]); // Usuario origen
                    fila.add(datos[2]); // Usuario destino
                    fila.add(datos[3] + " duts"); // Cantidad

                    modelo.addRow(fila);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar movimientos en la tabla: " + e.getMessage());
        }
    }
}