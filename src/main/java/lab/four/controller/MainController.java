package lab.four.controller;

import com.formdev.flatlaf.FlatLightLaf;
import lab.four.view.MainView;

import java.io.File;

public class MainController {
    public MainController() {
        FlatLightLaf.setup();
        File icon = new File("src/main/resources/ico.png");
        MainView mainView = new MainView(600, 600, "Lab 04: Fortune Teller (Jordan Yates)", icon.getAbsolutePath());
    }
}
