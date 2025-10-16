import java.util.Scanner;

public class prueba10 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n Pokédex Interactiva ");
            System.out.println("1. Buscar Pokémon por nombre");
            System.out.println("2. Comparar estadísticas de Pokémon");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            Thread.sleep(1000);

            while (!sc.hasNextInt()) {
                System.out.print("Por favor, introduce un número (1-3): ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del Pokémon: ");
                    String nombrePokemon = sc.nextLine();

                    switch (nombrePokemon.toLowerCase()) {
                        case "pikachu":
                            System.out.println("\nPikachu ");
                            System.out.println("Tipo: Eléctrico");
                            System.out.println("Habilidad: Impactrueno Supremo");
                            System.out.println("Descripción: Un pequeño ratón eléctrico con gran energía.\n");
                            break;

                        case "mewtwo":
                            System.out.println("\nMewtwo ");
                            System.out.println("Tipo: Psíquico");
                            System.out.println("Habilidad: Poder Mental Absoluto");
                            System.out.println("Descripción: Un Pokémon creado por manipulación genética.\n");
                            break;

                        case "gyarados":
                            System.out.println("\nGyarados ");
                            System.out.println("Tipo: Agua / Volador");
                            System.out.println("Habilidad: Ira del Dragón");
                            System.out.println("Descripción: Un enorme Pokémon serpiente que emerge del mar con furia\n");
                            break;

                        default:
                            System.out.println("\nPokémon no encontrado en la Pokédex\n");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\n⚔Comparando estadísticas entre Groudon y Kyogre\n");

                    int ataqueGroudon = 150, defensaGroudon = 140;
                    int ataqueKyogre = 150, defensaKyogre = 90;

                    if (ataqueGroudon > ataqueKyogre) {
                        System.out.println("Groudon tiene más ataque (" + ataqueGroudon + ") que Kyogre (" + ataqueKyogre + ").");
                    } else if (ataqueKyogre > ataqueGroudon) {
                        System.out.println("Kyogre tiene más ataque (" + ataqueKyogre + ") que Groudon (" + ataqueGroudon + ").");
                    } else {
                        System.out.println("Ambos Pokémon tienen el mismo ataque (" + ataqueGroudon + ").");
                    }

                    if (defensaGroudon > defensaKyogre) {
                        System.out.println("Groudon tiene más defensa (" + defensaGroudon + ") que Kyogre (" + defensaKyogre + ").");
                    } else if (defensaKyogre > defensaGroudon) {
                        System.out.println("Kyogre tiene más defensa (" + defensaKyogre + ") que Groudon (" + defensaGroudon + ").");
                    } else {
                        System.out.println("Ambos Pokémon tienen la misma defensa (" + defensaGroudon + ").");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("\n Cerrando la Pokédex... ¡Hasta pronto, Entrenador!\n");
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, elige de nuevo.\n");
                    break;
            }

        } while (opcion != 3);
        sc.close();
    }
}
