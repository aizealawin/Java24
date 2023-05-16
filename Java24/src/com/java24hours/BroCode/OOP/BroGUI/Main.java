package com.java24hours.BroCode.OOP.BroGUI;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); //creates a frame for us
        frame.setTitle("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes out of application, default is hide
        frame.setResizable(false); // disables ability to resize
        frame.setSize(420,420); // sets x and y dimension of frame
        frame.setVisible(true); // makes frame visible

        ImageIcon image = new ImageIcon("OOP/BroGUI/ArrosaStar.png"); // creates an image icon
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(123,50,250)); //change color of bg





    }
}
