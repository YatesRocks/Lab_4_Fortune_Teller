package lab.four.view.card.utils;

import lab.four.observer.IFortuneController;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.*;

public class FortuneTeller extends JScrollPane {
    private IFortuneController controller;
    private JTextArea textArea = new JTextArea();

    public FortuneTeller(IFortuneController controller) {
        this.controller = controller;
        configureTextArea();
        setViewportView(textArea);
    }

    private void configureTextArea() {
        textArea.setEditable(false);
        textArea.setLineWrap(false);
        textArea.setWrapStyleWord(true);
        textArea.setColumns(controller.readFortune().length());
        textArea.setRows(cursor);
    }

    private int cursor = 25;

    public void tellFortune() {
        String fortune = controller.readFortune();
        if (fortune.length() >= textArea.getColumns())
            textArea.setColumns(fortune.length() / 2);
        textArea.append(fortune + "\n");
        textArea.setCaretPosition(textArea.getDocument().getLength());
        textArea.setRows(cursor++);
    }
}
