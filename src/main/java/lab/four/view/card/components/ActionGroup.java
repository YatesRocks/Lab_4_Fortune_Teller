package lab.four.view.card.components;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ActionGroup extends JPanel {

    public ActionGroup(FortuneTeller teller) {
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
