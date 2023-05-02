package com.java24hours.BroCode.OOP.BroExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exception = an event that occurs during the execution of a program that,
        // disrupts the normal flow of instructions in the program
            Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            double x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            double y = scanner.nextInt();

            double z = x / y;

            System.out.println("Result: " + z);
        } catch(ArithmeticException e){
            System.out.println("You can't divide by zero! IDIOT!");
        } catch(InputMismatchException e){
            System.out.println("PLEASE ENTER A NUMBER OMFG!!");
        } catch(Exception e){
            System.out.println("Something went wrong.");
        }
        finally {
        scanner.close();
        }
    }
}
