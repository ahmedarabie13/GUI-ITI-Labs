package com.arabie;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {

    private JButton cntWords;
    private JButton cntChars;
    private BtnsChoiceListener btnsChoiceListener;

    public void setChoiceListener(BtnsChoiceListener btnsChoiceListener) {
        this.btnsChoiceListener = btnsChoiceListener;
    }

    public ToolBar(){
        cntWords = new JButton("Count Words");
        cntChars = new JButton("Count Characters");
        cntWords.addActionListener((e)->{
            ToolBarEvent ev =new ToolBarEvent(this,"WORDS");
            btnsChoiceListener.choiceHandler(ev);
        });
        cntChars.addActionListener((e)->{
            ToolBarEvent ev =new ToolBarEvent(this,"CHARS");
            btnsChoiceListener.choiceHandler(ev);
        });
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(cntWords);
        add(cntChars);

    }


}
