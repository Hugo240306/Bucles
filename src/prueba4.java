import java.util.Scanner;

public class prueba4 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce el nombre de tu Pokémon: ");
                String nombre = sc.nextLine();

                System.out.print("Introduce el nivel actual de " + nombre + ": ");
                int nivelActual = sc.nextInt();

                System.out.print("¿Cuántos niveles quieres que suba " + nombre + "?: ");
                int nivelesASubir = sc.nextInt();

                for (int nivel = nivelActual + 1; nivel <= nivelActual + nivelesASubir; nivel++) {
                    System.out.println(nombre + " ha subido al nivel " + nivel);

                    if (nivel == 16 || nivel == 36) {
                        String mensajeEvolucion = nombre + " está evolucionando!";
                        System.out.println(mensajeEvolucion);
                    }

                }
                int nivelFinal = nivelActual + nivelesASubir;
                System.out.println("El entrenamiento ha terminado. El nivel final de " + nombre + " es " + nivelFinal );

                sc.close();
            }
        }
