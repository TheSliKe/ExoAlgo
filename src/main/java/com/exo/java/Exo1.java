package com.exo.java;


import java.util.Scanner;

public class Exo1{

    public static void main( String[] args ){

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----celsius en fahrenheit-----");
        System.out.print("Degrés en Celsius : ");
        int degres = scanner.nextInt();
        System.out.print("Degrés en Fahrenheit : " + ((degres * 9/5) + 32));

    }

}
