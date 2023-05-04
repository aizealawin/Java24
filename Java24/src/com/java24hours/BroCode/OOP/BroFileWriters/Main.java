package com.java24hours.BroCode.OOP.BroFileWriters;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("OOP/BroFileWriters/poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' Everywhere!");
            writer.append("\n(A poem by Bro)");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
