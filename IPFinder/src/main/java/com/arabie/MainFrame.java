package com.arabie;

import javax.swing.*;
import java.awt.*;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class MainFrame extends JFrame {

    private MainPanel mainPanel;

    public MainFrame(){
        super("IP Finder");
        mainPanel = new MainPanel();
        mainPanel.setStrDataListener((e)->{
            String data =e.getUrl();
            try {
                InetAddress ia;
//                URL url= new URL(data);
//                ia=InetAddress.getByName(url.getHost());
//                if(data.substring(0,4).equals("http")){
//                data.matches("((?:[a-z0-9]+[.]){1,3}[a-z]{2,})");
                if(data.contains("://")){

                    ia=InetAddress.getByName(new URL(data).getHost());
                }
                else{
                    ia=InetAddress.getByName(data);
                }

                String ip="URL:\t\t\""+data+"\"\nIP: \t\t"+ia.getHostAddress();
                JOptionPane.showMessageDialog(this,ip);
            } catch (UnknownHostException | MalformedURLException e1) {
                JOptionPane.showMessageDialog(this,e1.toString());
            }
        });
        add(mainPanel,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
    }
}
