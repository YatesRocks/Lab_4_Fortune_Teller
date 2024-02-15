package lab.four.controller;

import com.formdev.flatlaf.FlatLightLaf;
import lab.four.model.FortuneModel;
import lab.four.view.MainView;
import lab.four.view.card.FortuneCard;

import java.io.File;

public class MainController {
    public MainController() {
        FlatLightLaf.setup();
        File icon = new File("src/main/resources/ico.png");
        MainView mainView = new MainView(600, 600, "Lab 04: Fortune Teller (Jordan Yates)", icon.getAbsolutePath());

        FortuneModel model = new FortuneModel();
        initFortuneCard(model, "Fortune");

        CardHandler.nextCard();
    }

    private void initFortuneCard(FortuneModel model, String label) {
        FortuneController controller = new FortuneController(model);
        FortuneCard card = new FortuneCard(controller, label);
        CardHandler.registerCard(label, card);
    }
}
