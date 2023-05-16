package com.java24hours.BroCode.OOP.BroGUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("OOP/BroGUI/ArrosaStar.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));
    }
}
