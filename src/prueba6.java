import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class prueba6 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://i.imgur.com/vs20r1Z.jpeg");

            ImageIcon originalIcon = new ImageIcon(url);

            Image scaledImage = originalIcon.getImage().getScaledInstance(1000, 1000, Image.SCALE_SMOOTH);

            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            JLabel label = new JLabel(scaledIcon);

            JFrame frame = new JFrame();
            frame.add(label);
            frame.pack();
            frame.setLocationRelativeTo(null); // Centrar ventana
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}