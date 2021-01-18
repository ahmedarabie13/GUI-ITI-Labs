package com.arabie;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MainPanel extends JPanel {
    private StringListener strDataListener;
    private JTextField textField;
    private JButton findBtn;
    private JLabel label;


    public void setStrDataListener(StringListener strDataListener) {
        this.strDataListener = strDataListener;
    }

    public MainPanel(){
        textField=new JTextField(20);
        findBtn= new JButton("Find IP");

//        int txtFdX=this.getWidth()/3;
//        int txtFdY=this.getHeight()/3-20;
//        int btnX=this.getWidth()/3;
//        int btnY=this.getHeight()/3+40;
        textField.setBounds(150,150,250,20);
        //textField.setVisible(true);
        findBtn.setBounds(225,200,80,20);
//        this.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                super.componentResized(e);
//                System.out.println(e.getComponent().getWidth());
//            }
//        });
        findBtn.addActionListener((e)->{

            ButtonEvent event = new ButtonEvent(this,textField.getText());
            if(strDataListener!=null){
                strDataListener.getBtnEvent(event);
            }

        });
        label=new JLabel("Enter URL: ");
        label.setBounds(80,150,100,20);
        setLayout(null);
        add(label);
        add(findBtn);
        add(textField);

    }

}
