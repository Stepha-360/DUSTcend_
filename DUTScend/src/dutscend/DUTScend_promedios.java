/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dutscend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author admin
 */
class DUTScend_promedios {
     private static final String ARCHIVO_TRANSACCIONES = "transacciones.txt";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Calcula el promedio de transferencias en un período dado (diario, mensual, anual).
     * @param usuarioOrigen Usuario que realiza las transferencias.
     * @param periodo "DIARIO", "MENSUAL" o "ANUAL"
     * @return Promedio de transferencias en el período o -1 si no hay registros.
     */
    public static double calcularPromedioPorPeriodo(String usuarioOrigen, String periodo) {
        List<Double> montos = new ArrayList<>();
        Calendar hoy = Calendar.getInstance();

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_TRANSACCIONES))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("De: " + usuarioOrigen + " →")) {
                    String[] partes = linea.split("\\| Cantidad: ");
                    if (partes.length == 2) {
                        String[] datos = partes[0].split("\\| Fecha: ");
                        if (datos.length == 2) {
                            Date fechaTransaccion = DATE_FORMAT.parse(datos[1].trim());
                            Calendar fecha = Calendar.getInstance();
                            fecha.setTime(fechaTransaccion);

                            // Filtrar según el período
                            if ((periodo.equalsIgnoreCase("DIARIO") && esMismoDia(hoy, fecha)) ||
                                (periodo.equalsIgnoreCase("MENSUAL") && esMismoMes(hoy, fecha)) ||
                                (periodo.equalsIgnoreCase("ANUAL") && esMismoAnio(hoy, fecha))) {
                                double monto = Double.parseDouble(partes[1].replace(" duts", "").trim());
                                montos.add(monto);
                            }
                        }
                    }
                }
            }
        } catch (IOException | NumberFormatException | java.text.ParseException e) {
            System.out.println("Error al leer transacciones.txt: " + e.getMessage());
            return -1;
        }

        return (montos.isEmpty()) ? -1 : montos.stream().mapToDouble(Double::doubleValue).average().orElse(-1);
    }

    // Métodos auxiliares para verificar fechas
    private static boolean esMismoDia(Calendar hoy, Calendar fecha) {
        return hoy.get(Calendar.YEAR) == fecha.get(Calendar.YEAR) &&
               hoy.get(Calendar.DAY_OF_YEAR) == fecha.get(Calendar.DAY_OF_YEAR);
    }

    private static boolean esMismoMes(Calendar hoy, Calendar fecha) {
        return hoy.get(Calendar.YEAR) == fecha.get(Calendar.YEAR) &&
               hoy.get(Calendar.MONTH) == fecha.get(Calendar.MONTH);
    }

    private static boolean esMismoAnio(Calendar hoy, Calendar fecha) {
        return hoy.get(Calendar.YEAR) == fecha.get(Calendar.YEAR);
    }

}
