package Act2T2;

public class Main {

    public static void main(String[] args) {
        Fruta naranja = new Fruta("Naranja", 10.0, 500.0, 1200.0);

        Periodo primavera = new Periodo("Primavera", 5.0);
        Periodo invierno = new Periodo("Invierno", 2.0);

        System.out.println("--- GESTIÓN DE PERIODOS ---");
        naranja.agregarPeriodo(primavera);
        naranja.agregarPeriodo(invierno);

        System.out.println("\n--- REPORTE: TEMPORADA DE PRIMAVERA ---");
        System.out.println("Fruta: " + naranja.getNombre());

        double costoPrimavera = naranja.calcularCostoTotal(primavera);
        System.out.println("Costo total estimado: $" + costoPrimavera);

        double gananciaPrimavera = naranja.calcularGanancias(primavera);
        System.out.println("Ganancia neta estimada: $" + gananciaPrimavera);

        System.out.println("\n--- REPORTE: TEMPORADA DE INVIERNO ---");
        double costoInvierno = naranja.calcularCostoTotal(invierno);
        System.out.println("Costo total estimado: $" + costoInvierno);

        double gananciaInvierno = naranja.calcularGanancias(invierno);
        System.out.println("Ganancia neta estimada: $" + gananciaInvierno);

        System.out.println("\n--- ELIMINANDO PERIODO ---");
        naranja.eliminarPeriodo(invierno);
        System.out.println("Periodos restantes en la lista: " + naranja.getListaDePeriodos().size());
    }

}