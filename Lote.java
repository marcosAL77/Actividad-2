class Lote {
    private int numeroLote;
    private int numeroPiezas;
    private String fechaFabricacion;
    private Prenda prenda;
    public Lote(int numeroLote, int numeroPiezas, String fechaFabricacion, Prenda
            prenda) {
        this.numeroLote = numeroLote;
        this.numeroPiezas = numeroPiezas;
        this.fechaFabricacion = fechaFabricacion;
        this.prenda = prenda;
    }
    public double calcularCostoTotal() {
        return numeroPiezas * prenda.getCostoProduccion();
    }
    public double calcularPrecioPorPieza() {
        return prenda.getCostoProduccion() * 1.15;
    }
    public double calcularPrecioLote() {
        return calcularCostoTotal() * 1.05;
    }
    public double calcularMontoRecuperacion() {
        return calcularPrecioLote() - calcularCostoTotal();
    }
}