
package dutscend;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fecha;
    private String estado;
    private static List<Evento> eventos = new ArrayList<>();

    public Evento(String nombre, String fecha, String estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getNombre() { return nombre; }
    public String getFecha() { return fecha; }
    public String getEstado() { return estado; }

    // Método estático para gestionar eventos
    public static void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public static List<Evento> obtenerEventos() {
        return eventos;
    }

    // Inicialización con algunos eventos
    static {
        agregarEvento(new Evento("Curso de Java", "10 Junio 2025", "Disponible"));
        agregarEvento(new Evento("Taller de UX", "15 Julio 2025", "Disponible"));
        agregarEvento(new Evento("Charla Seguridad", "20 Agosto 2025", "Cerrado"));
      
    }
}
