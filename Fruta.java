package Act2T2;
import java.util.ArrayList;
public class Fruta {
    private String nombre;
    private double hectareas;
    private double costoProduccionPorTonelada;
    private double precioVentaPorTonelada;

    private ArrayList<Periodo> listaDePeriodos;

    public Fruta(String nombre, double hectareas, double costoProduccionPorTonelada, double precioVentaPorTonelada) {
        this.nombre = nombre;
        this.hectareas = hectareas;
        this.costoProduccionPorTonelada = costoProduccionPorTonelada;
        this.precioVentaPorTonelada = precioVentaPorTonelada;
        this.listaDePeriodos = new ArrayList<>();
    }

    public void agregarPeriodo(Periodo nuevoPeriodo) {
        this.listaDePeriodos.add(nuevoPeriodo);
        System.out.println("Periodo de " + nuevoPeriodo.getEstacionClimatica() + " agregado con éxito.");
    }

    public void eliminarPeriodo(Periodo periodoAEliminar) {
        this.listaDePeriodos.remove(periodoAEliminar);
        System.out.println("Periodo eliminado.");
    }

    public double calcularCostoTotal(Periodo periodo) {
        double toneladasTotales = this.hectareas * periodo.getCantidadEstimadaPorHectarea();
        return toneladasTotales * this.costoProduccionPorTonelada;
    }

    public double calcularGanancias(Periodo periodo) {
        double toneladasTotales = this.hectareas * periodo.getCantidadEstimadaPorHectarea();
        double ingresosBrutos = toneladasTotales * this.precioVentaPorTonelada;
        double costoTotal = calcularCostoTotal(periodo);
        return ingresosBrutos - costoTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Periodo> getListaDePeriodos() {
        return listaDePeriodos;
    }
}