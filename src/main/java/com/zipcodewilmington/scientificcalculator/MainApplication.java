package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");

        String s = Console.getStringInput("Enter a string");
        Console.println("The user input %s as a string", s);

        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);

        Double d = Console.getDoubleInput("Enter a double.");
        Console.println("The user input %s as a d", d);
    }
}
