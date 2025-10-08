import java.util.Scanner;

public class prueba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador :");
        String nombre = sc.nextLine();

        System.out.print("Introduce el número de partidos jugados: ");
        int partidos = sc.nextInt();

        System.out.print("Introduce el total de goles marcados: ");
        int goles = sc.nextInt();
        double promedioGoles;
        String clasificacion;
        if (partidos <= 0) {
            promedioGoles = 0;
            clasificacion = "No se puede evaluar el rendimiento sin haber jugado partidos.";
        } else {
            promedioGoles = (double) goles / partidos;

            if (promedioGoles >= 0.8) {
                clasificacion = "¡Bota de Oro!";
            } else if (promedioGoles >= 0.5) {
                clasificacion = "Muy buen rendimiento. ¡Es un gran goleador!";
            } else if (promedioGoles > 0) {
                clasificacion = "Necesita mejorar su promedio, pero sigue trabajando.";
            } else {
                clasificacion = "No ha marcado goles aún. ¡Ánimo!";
            }
        }
        System.out.printf("Jugador: " + nombre);
        System.out.printf("  Promedio de goles por partido: ", promedioGoles);
        System.out.println("Clasificación: " + clasificacion);
        System.out.println("========================================");
    }
}