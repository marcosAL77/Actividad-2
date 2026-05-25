import java.util.ArrayList;

public class CuerpoCeleste {

    String nombre;
    String composicion;
    ArrayList<Observacion> observaciones;

    public CuerpoCeleste(String nombre, String composicion)
    {
        this.nombre = nombre;
        this.composicion = composicion;
        this.observaciones = new ArrayList<>();
    }

    public void agregarObservaciones(Observacion o) {
        observaciones.add(o);
    }

    public double calcularDesplazamiento(Observacion o1, Observacion o2)
    {
        double diferenciaLatitud = o2.latitud - o1.latitud;
        double diferenciaLonguitud = o2.longuitud - o1.longuitud;

        return Math.sqrt(
                Math.pow(diferenciaLatitud, 2) + Math.pow(diferenciaLonguitud, 2)
        );
    }
}