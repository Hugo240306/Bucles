import java.util.Scanner;

public class prueba3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un director de cine:");
        System.out.println("1. Christopher Nolan");
        System.out.println("2. Quentin Tarantino");
        System.out.println("3. Guillermo del Toro");
        System.out.println("------------------------------------------");
        System.out.print("Escribe el nombre del director: ");
        String director = sc.nextLine();

        switch (director) {
            case "Christopher Nolan":
                System.out.println("Te recomiendo ver la pelicula : Inception");
                System.out.println(" Te gustas las peliculas de ciencia ficcion si/no ");
                String respuestaNolan = sc.nextLine();

                if (respuestaNolan.equalsIgnoreCase("sí") || respuestaNolan.equalsIgnoreCase("si")) {
                    System.out.println("¡Genial! Disfrutarás de sus mundos complejos.");
                } else {
                    System.out.println("Quizás prefieras su película 'The Dark Knight', que es más de acción.");
                }
                break;

            case "Quentin Tarantino":
                System.out.println("Te recomiendo ver 'Pulp Fiction'.");
                System.out.print("¿Te gustan los diálogos ingeniosos? (sí/no): ");
                String respuestaTarantino = sc.nextLine();

                if (respuestaTarantino.equalsIgnoreCase("sí") || respuestaTarantino.equalsIgnoreCase("si")) {
                    System.out.println("¡Perfecto! Te encantará el guion.");
                } else {
                    System.out.println("No te preocupes, la acción y la trama también son excelentes.");
                }
                break;

            case "Guillermo del Toro":
                System.out.println("Te recomiendo ver 'El Laberinto del Fauno'.");
                System.out.print("¿Te gustan las historias de fantasía oscura? (sí/no): ");
                String respuestaDelToro = sc.nextLine();

                if (respuestaDelToro.equalsIgnoreCase("sí") || respuestaDelToro.equalsIgnoreCase("si")) {
                    System.out.println("Te sumergirás en un mundo mágico e inolvidable.");
                } else {
                    System.out.println("Puedes probar con 'Pacific Rim' para una dosis de acción con monstruos gigantes.");
                }
                break;

            default:
                System.out.println("Director no encontrado en nuestra base de datos.");
                break;
        }

        sc.close();
    }
}
