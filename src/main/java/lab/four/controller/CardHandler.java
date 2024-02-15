package lab.four.controller;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/// CardHandler uses the Singleton design pattern
/// to allow any code within the application to switch
/// cards on a whim.
public class CardHandler {
    private static final ArrayList<String> cards = new ArrayList<>();
    private static CardLayout layout = null;
    private static JPanel panel = null;
    private static String currentCard;


    public static void nextCard() {
        int nextCard = (cards.indexOf(currentCard) + 1) % cards.size();
        currentCard = cards.get(nextCard);
        layout.show(panel, currentCard);
    }

    public static void switchCard(String label) {
        layout.show(panel, label);
    }

    public static void registerCard(String label, JComponent jComponent) {
        cards.add(label);
        panel.add(jComponent, label);
    }

    public static void registerLayout(CardLayout cardLayout) {
        if (layout != null)
            throw new IllegalStateException("Attempted to redefine layout");
        CardHandler.layout = cardLayout;
    }

    public static void registerRootPanel(JPanel cardPanel) {
        if (panel != null)
            throw new IllegalStateException("Attempted to redefine the CardPanel");
        CardHandler.panel = cardPanel;
    }
}
