package lab.four;

import lab.four.controller.MainController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainController::new);
    }
}