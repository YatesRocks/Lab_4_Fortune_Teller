package lab.four.view.card;

import lab.four.observer.IFortuneController;
import lab.four.view.card.utils.ActionGroup;
import lab.four.view.card.utils.FortuneTeller;
import lab.four.view.card.utils.TitleFont;
import lab.four.view.card.utils.TitleGroup;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class FortuneCard extends JPanel {
    private final FortuneTeller teller;

    public FortuneCard(IFortuneController controller, String title) {
        setLayout(new MigLayout());
        this.teller = new FortuneTeller(controller);
        add(fortuneGroup(title), "push, align center, center");
    }

    private JPanel fortuneGroup(String title) {
        JPanel panel = new JPanel(new MigLayout());
        add(title(title), "wrap, align center, center");
        add(tellerPanel(), "wrap, align center, center");
        add(new ActionGroup(teller), "wrap, align center, center");
        return panel;
    }

    private JPanel title(String title) {
        JPanel panel = new JPanel(new MigLayout());
        panel.add(new TitleGroup(title, new TitleFont(), "src/main/resources/ico.png"));
        return panel;
    }

    private JPanel tellerPanel() {
        JPanel panel = new JPanel(new MigLayout());
        panel.add(teller);
        return panel;
    }
}
