/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("What is your age?");
        age = scanner.nextInt();

        scanner.close();

        String output = (age >= 16) ? "You are old enough to legally drive" : "You are not old enough to legally drive";
        System.out.println(output);
    }
}
