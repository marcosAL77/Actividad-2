package Act2T2;

public class Periodo {
    private String estacionClimatica;
    private double cantidadEstimadaPorHectarea;

    public Periodo(String estacionClimatica, double cantidadEstimadaPorHectarea) {
        this.estacionClimatica = estacionClimatica;
        this.cantidadEstimadaPorHectarea = cantidadEstimadaPorHectarea;
    }

    public String getEstacionClimatica() {
        return estacionClimatica;
    }

    public void setEstacionClimatica(String estacionClimatica) {
        this.estacionClimatica = estacionClimatica;
    }

    public double getCantidadEstimadaPorHectarea() {
        return cantidadEstimadaPorHectarea;
    }

    public void setCantidadEstimadaPorHectarea(double cantidadEstimadaPorHectarea) {
        this.cantidadEstimadaPorHectarea = cantidadEstimadaPorHectarea;
    }
}