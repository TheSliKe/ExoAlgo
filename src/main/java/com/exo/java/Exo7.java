package com.exo.java;

import java.util.Scanner;

public class Exo7 {

    public static void main( String[] args ){

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----palindrome-----");

        System.out.print("verif palindrome : ");
        String input = scanner.next();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        stringBuilder.reverse();

        if (input.equals(stringBuilder.toString())){
            System.out.println("Palindrome");
        } else {
            System.out.println("Pas Palindrome");
        }

    }

}
