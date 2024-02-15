package lab.four.view.card.utils;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class TitleGroup extends JPanel {
    public TitleGroup(String title, Font font, String path) {
        String padding = " ";
        JLabel label = new JLabel(padding + title);

        label.setFont(font);
        label.setIcon(generateImageIcon(path, 8));

        add(label, "align center, center");
    }

    private ImageIcon generateImageIcon(String path, int scale) {
        ImageIcon icon = new ImageIcon(path);

        Image iconImage = icon.getImage();
        int scaledWidth = icon.getIconWidth() / scale;
        int scaledHeight = icon.getIconHeight() / scale;
        Image scaledIcon = iconImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

        icon = new ImageIcon(scaledIcon);
        return icon;
    }
}
