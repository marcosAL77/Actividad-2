public class Observacion {
    double latitud;
    String hemisferiolatitud;
    double longuitud;
    String hemisferiolonguitud;
    String periodo;
    double distancia;
    String unidadDistancia;

    public Observacion(double latitud, String hemisferiolatitud, double longuitud, String hemisferiolonguitud,
                       String periodo, double distancia, String unidadDistancia)
    {
        this.latitud = latitud;
        this.hemisferiolatitud = hemisferiolatitud;
        this.longuitud = longuitud;
        this.hemisferiolonguitud = hemisferiolonguitud;
        this.periodo = periodo;
        this.distancia = distancia;
        this.unidadDistancia = unidadDistancia;
    }

}