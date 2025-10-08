import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la velocidad actual de tu coche (km/h): ");
        int velocidad = sc.nextInt();
        boolean esExcesoVelocidad = false;
        if (velocidad > 120) {
            esExcesoVelocidad = true;
        } else {
            esExcesoVelocidad = false;
        }
        if (esExcesoVelocidad == true) {
            System.out.println("¡Atención! Vas a una velocidad excesiva. ¡Riesgo de multa!");
        } else {
            System.out.println("Velocidad adecuada. ¡Sigue así y conduce con seguridad!");
        }
        sc.close();
    }
}

