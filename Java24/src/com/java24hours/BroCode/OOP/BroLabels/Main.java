package com.java24hours.BroCode.OOP.BroLabels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JLabel = GUI display area for a string of text image or both
        ImageIcon image = new ImageIcon("OOP/BroLabels/ArrosaStar.png");
        Border border = BorderFactory.createLineBorder(Color.MAGENTA,3);

        JLabel label = new JLabel();
        label.setText("Bro do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(123,50,250));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(-25);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        frame.add(label);
    }
}
