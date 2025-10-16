import java.io.IOException;
import java.util.Scanner;

public class prueba5 {
    public static void main(String[] args)  throws InterruptedException {
        int vidaPikachu = 100;
        int ataquePikachu = 55;
        int vidaGengar = 120;
        int ataqueGengar = 50;
        System.out.println("Empieza el combate");
        for (int turno = 3; turno >= 1; turno--) {
            System.out.println("Turnos restantes: " + turno);
            vidaGengar -= ataquePikachu;
            System.out.println("Pikachu ataca a Gengar. Vida de Gengar ahora es: " + vidaGengar);
            vidaPikachu -= ataqueGengar;
            System.out.println("Gengar ataca a Pikachu. Vida de Pikachu ahora es: " + vidaPikachu);
            Thread.sleep(2000);
            if (vidaGengar <= 0) {
                System.out.println("Gengar se ha debilitado. ¡Pikachu gana!");
                break;
            }
            if (vidaPikachu <= 0) {
                System.out.println("Pikachu se ha debilitado. ¡Gengar gana!");
                break;
            }
        }
        }
}

