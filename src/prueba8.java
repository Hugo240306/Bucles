import java.util.Scanner;

public class prueba8 {
    public static void main(String[] args) {
        String pelicula = "Indiana Jones y la última cruzada";
        String actorCorrecto = "Harrison Ford";
        boolean haAdivinado = false;

        System.out.println("Adivina el Actor");
        System.out.println("Película: " + pelicula);
        System.out.println("Tienes 3 intentos para adivinar al protagonista.\n");

        Scanner sc = new Scanner(System.in);

        for (int intento = 1; intento <= 3; intento++) {
            System.out.print("Intento " + intento + " - ¿Quién es el actor principal?: ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase(actorCorrecto)) {
                haAdivinado = true;
                System.out.println(" Bien , el actor es " + actorCorrecto + ".");
                break;
            } else {
                System.out.println("Incorrecto, prueba de nuevo .");

                if (intento == 1) {
                    System.out.println("Pista 1: Su personaje a menudo lleva un sombrero y un látigo.\n");
                } else if (intento == 2) {
                    System.out.println("Pista 2: También es famoso por pilotar el Halcón Milenario en otra saga.\n");
                }
            }
        }

        if (!haAdivinado) {
            System.out.println("Has perdido. El actor era " + actorCorrecto + ".");
        }

        sc.close();
    }
}
