package org.example;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
//2- Define a program to find out whether a given number is even or odd.
        Scanner sc = new Scanner(System.in);
        int num5;
        System.out.println("Enter the value");
        num5 = sc.nextInt();
        if (num5 % 2 == 0) {
            System.out.println(num5 + " is a even number");
            System.out.println("This is a first line");
        } else {
            System.out.println(num5 + "  is a odd number");
        }


    }
}
