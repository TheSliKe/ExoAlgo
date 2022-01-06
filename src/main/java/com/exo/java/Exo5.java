package com.exo.java;

import java.util.Scanner;

public class Exo5 {

    public static void main( String[] args ){

        Scanner scanner = new Scanner(System.in);
        String[] list = new String[3];

        System.out.println("-----array init-----");

        for (int i = 0; i < list.length; i++) {
            System.out.print("ajout : ");
            list[i] = scanner.next();
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }


    }

}
