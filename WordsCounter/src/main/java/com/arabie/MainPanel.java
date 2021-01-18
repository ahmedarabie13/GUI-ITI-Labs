package com.arabie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.TextListener;

public class MainPanel extends JPanel {
    private  JTextArea textArea;


    public MainPanel(){

        textArea= new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea),BorderLayout.CENTER);

    }
    public String getTextData(){

        return textArea.getText();

    }
}
