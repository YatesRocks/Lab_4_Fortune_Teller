package lab.four.view;

import lab.four.Main;

import javax.swing.*;

public class MainView extends JFrame {
    public MainView(int width, int height, String title, String path) {
        ImageIcon icon = new ImageIcon(path);
        setIconImage(icon.getImage());

        setTitle(title);
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
