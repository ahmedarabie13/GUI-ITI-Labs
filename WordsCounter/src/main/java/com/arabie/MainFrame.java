package com.arabie;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private MainPanel mainPanel;
    private ToolBar toolBar;

    public MainFrame(){
        super("Word and Character Counter");
        mainPanel = new MainPanel();
        toolBar =new ToolBar();

        toolBar.setChoiceListener((e)->{
            String cntType=e.getCntType();
            String data =mainPanel.getTextData();
            if(cntType.equals("WORDS")){
                String strArr[] =data.split("\\w+");
                JOptionPane.showMessageDialog(this,"TotalWords: "+strArr.length);
            }
            else if(cntType.equals("CHARS")){
                String temp = data.replaceAll(" ","").replaceAll("\n","");
                JOptionPane.showMessageDialog(this,"Total Chars: "+temp.length());
            }

        });

        add(mainPanel,BorderLayout.CENTER);
        add(toolBar,BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
    }
}
