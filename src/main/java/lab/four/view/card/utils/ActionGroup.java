package lab.four.view.card.utils;

import lab.four.controller.MainController;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ActionGroup extends JPanel {
    private FortuneTeller teller;

    public ActionGroup(FortuneTeller teller) {
        this.teller = teller;
        setLayout(new MigLayout());
        add(createButton("Get your fortune!", e -> teller.tellFortune()));
        add(createButton("Quit", e -> System.exit(0)));
    }

    private JButton createButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        return button;
    }
}
