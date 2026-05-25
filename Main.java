public class  Main {

    public static void main(String[] args)
    {
        CuerpoCeleste estrella = new CuerpoCeleste("Estrella x", "Gases");

        Observacion obs1 = new Observacion(10.5, "N", 20.3, "E",
                "Enero-Febrero", 4.5, "Años luz");

        Observacion obs2 = new Observacion(12.0, "N", 25.0, "E",
                "Marzo-Abril", 4.6, "Años luz");

        estrella.agregarObservaciones(obs1);
        estrella.agregarObservaciones(obs2);

        double desplazamiento = estrella.calcularDesplazamiento(obs1, obs2);
        System.out.println("*** EJEMPLO ***");
        System.out.println("Desplazamineto: " + desplazamiento);
    }
}