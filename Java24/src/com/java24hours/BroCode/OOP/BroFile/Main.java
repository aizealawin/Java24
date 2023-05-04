package com.java24hours.BroCode.OOP.BroFile;

import java.io.File;
public class Main {
    public static void main(String[] args) {
        // file = An abstract representation of file and directory path names.

        File file = new File("/Users/kusaltholkamudalige/personal_study/Java24/Java24/src/com/java24hours/BroCode/OOP/BroFile/secret_message.txt");

        if(file.exists()){
            System.out.println("That file exists! :0!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.delete());
        } else {
            System.out.println("That file doesn't exist :(");
        }

    }
}
