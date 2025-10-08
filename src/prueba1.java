import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) {
        System.out.println("Introduce la velocidad actual de tu coche (km/h : " );
        Scanner sc = new Scanner(System.in);
        int velocidad = sc.nextInt();
        boolean ExcesoVelocidad = velocidad>120;
        if(ExcesoVelocidad){
            System.out.println("Reduce la velocidad actual de tu coche");
        }
        else{
            System.out.println("Velocidad correcta");
        }
    }
}

