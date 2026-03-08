
import java.util.Random;

class retoCCCF {

    private static final int TOTAL_MINUTOS = 720;
    private static final int TOTAL_CAJAS = 4;
    private static final double PROB_LLEGADA = 0.4;
    private static final int MIN_PAQUETES = 5;
    private static final int MAX_PAQUETES = 15;

    public static void main(String[] args) {
        Random random = new Random();

        int cola = 0;
        int minutosSinCola = 0;
        int totalPaquetes = 0;
        int personasQueLlegaron = 0;
        int[] cajas = new int[TOTAL_CAJAS];

        for (int minuto = 1; minuto <= TOTAL_MINUTOS; minuto++) {
            System.out.print("Minuto " + minuto + " - ");

            if (random.nextDouble() <= PROB_LLEGADA) {
                cola++;
                personasQueLlegaron++;
                System.out.print("Llego 1 persona");
            } else {
                System.out.print("No llego ninguna persona");
            }

            System.out.println(" - en cola: " + cola);
            if (cola == 0) {
                minutosSinCola++;
            }

            for (int indiceCaja = 0; indiceCaja < TOTAL_CAJAS; indiceCaja++) {
                if (cajas[indiceCaja] == 0 && cola > 0) {
                    cola--;
                    int paquetes = generarPaquetes(random);
                    totalPaquetes += paquetes;
                    cajas[indiceCaja] = paquetes;
                    System.out.println("  - Pasa una persona a la caja " + (indiceCaja + 1)
                            + " llevando [" + paquetes + "] packs");
                }

                if (cajas[indiceCaja] > 0) {
                    cajas[indiceCaja]--;
                    System.out.println("  - La caja " + (indiceCaja + 1)
                            + " atiende una persona, le quedan " + cajas[indiceCaja]);
                }
            }

            imprimirEstadoColaYCajas(cola, cajas);
        }

        imprimirResumen(minutosSinCola, cola, personasQueLlegaron, totalPaquetes);
    }

    private static int generarPaquetes(Random random) {
        return random.nextInt(MAX_PAQUETES - MIN_PAQUETES + 1) + MIN_PAQUETES;
    }

    private static void imprimirEstadoColaYCajas(int cola, int[] cajas) {
        System.out.println("  Espera: " + cola);
        for (int i = 0; i < cajas.length; i++) {
            System.out.print("  Caja " + (i + 1) + ":[Faltan " + cajas[i] + " packs]");
        }
        System.out.println();
        System.out.println("----------------------------------------");
    }

    private static void imprimirResumen(int minutosSinCola, int colaFinal, int personasQueLlegaron, int totalPaquetes) {
        System.out.println("Resumen:");
        System.out.println("========================================");
        System.out.println("Minutos con cola en cero      : " + minutosSinCola);
        System.out.println("Personas en la cola al cierre : " + colaFinal);
        System.out.println("Personas atendidas en el dia  : " + (personasQueLlegaron - colaFinal));
        System.out.println("Productos vendidos en el dia  : " + totalPaquetes);
        System.out.println("Fin del dia");
    }
}
