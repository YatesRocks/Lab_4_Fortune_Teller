package lab.four.view.card.utils;

import javax.swing.*;
import java.awt.*;

public class TitleGroup extends JPanel {
    public TitleGroup(String title, Font font, String path) {
        String padding = " ";
        JLabel label = new JLabel(padding + title);

        label.setFont(font);
        label.setIcon(generateImageIcon(path));

        add(label, "align center, center");
    }

    private ImageIcon generateImageIcon(String path) {
        ImageIcon icon = new ImageIcon(path);

        Image iconImage = icon.getImage();
        int scaledWidth = icon.getIconWidth() / 8;
        int scaledHeight = icon.getIconHeight() / 8;
        Image scaledIcon = iconImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

        icon = new ImageIcon(scaledIcon);
        return icon;
    }
}
