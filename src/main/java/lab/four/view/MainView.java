package lab.four.view;

import lab.four.Main;
import lab.four.controller.CardHandler;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    public MainView(int width, int height, String title, String path) {
        ImageIcon icon = new ImageIcon(path);
        setIconImage(icon.getImage());

        setTitle(title);
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initLayout();

        setVisible(true);
    }

    private void initLayout() {
        CardLayout layout;
        setLayout(layout = new CardLayout());
        JPanel cardPanel = new JPanel(layout);
        CardHandler.registerLayout(layout);
        CardHandler.registerRootPanel(cardPanel);
        add(cardPanel);
    }
}
