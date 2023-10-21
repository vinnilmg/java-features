package packaging.tool.main;

import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha janela em Java");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
}
