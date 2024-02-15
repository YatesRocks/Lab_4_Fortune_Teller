package lab.four.view.card.components;

import lab.four.observer.IFortuneController;

import javax.swing.*;

public class FortuneTeller extends JScrollPane {
    private final IFortuneController controller;
    private final JTextArea textArea = new JTextArea();

    public FortuneTeller(IFortuneController controller) {
        this.controller = controller;
        configureTextArea();
        setViewportView(textArea);
    }

    private void configureTextArea() {
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setColumns(controller.readFortune().length());
        textArea.setRows(cursor);
    }

    private int cursor = 25;

    public void tellFortune() {
        String fortune = controller.readFortune();
        if (fortune.length() >= textArea.getColumns())
            textArea.setColumns(fortune.length() / 2);
        textArea.append(fortune + "\n~ ~ ~ ~ ~\n");
        textArea.setCaretPosition(textArea.getDocument().getLength());
        textArea.setRows(cursor++);
    }
}
