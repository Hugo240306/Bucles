import java.io.IOException;
public class prueba9 {
    public static void main(String[] args) throws InterruptedException {
        String nombreCoche1 = "Muscle Car";
        double velocidad1 = 0.0;
        double distancia1 = 0.0;
        double aceleracion1 = 5.5;

        String nombreCoche2 = "Deportivo Japonés";
        double velocidad2 = 0.0;
        double distancia2 = 0.0;
        double aceleracion2 = 6.0;

        final double META = 400.0; // metros
        boolean carreraTerminada = false;

        System.out.println("Comienza la carrera \n");


        for (int segundo = 1; segundo <= 15; segundo++) {


            velocidad1 += aceleracion1;
            distancia1 += velocidad1;

            velocidad2 += aceleracion2;
            distancia2 += velocidad2;

            Thread.sleep(1000);

            System.out.printf("Segundo %2d: %s ha recorrido %.2f m | %s ha recorrido %.2f m%n",
                    segundo, nombreCoche1, distancia1, nombreCoche2, distancia2);

            if (distancia1 >= META && distancia2 >= META) {
                if (distancia1 > distancia2) {
                    System.out.println("\nEmpate técnico, pero el ganador por distancia es el " + nombreCoche1);
                } else if (distancia2 > distancia1) {
                    System.out.println("\nEmpate técnico, pero el ganador por distancia es el " + nombreCoche2);
                } else {
                    System.out.println("\nEmpate perfecto! Ambos coches cruzaron al mismo tiempo y distancia.");
                }
                carreraTerminada = true;
                break;
            } else if (distancia1 >= META) {
                System.out.println(nombreCoche1 + " ha cruzado la meta y gana la carrera");
                carreraTerminada = true;
                break;
            } else if (distancia2 >= META) {
                System.out.println(nombreCoche2 + " ha cruzado la meta y gana la carrera!");
                carreraTerminada = true;
                break;
            }
        }

        if (!carreraTerminada) {
            System.out.println("\n¡Tiempo agotado! Nadie cruzó la meta.");
            if (distancia1 > distancia2) {
                System.out.println(" El ganador es el " + nombreCoche1 + " con " + String.format("%.2f", distancia1) + " m recorridos.");
            } else if (distancia2 > distancia1) {
                System.out.println(" El ganador es el " + nombreCoche2 + " con " + String.format("%.2f", distancia2) + " m recorridos.");
            } else {
                System.out.println(" ¡Empate! Ambos coches recorrieron la misma distancia.");
            }
        }
    }
}
