package com.exo.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo9 {

    public static void main( String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----ArrayList-----");

        List list = new ArrayList<>();
        System.out.println(list);

        boolean run = true;
        while(run){

            System.out.print("Ajout éléments(exit pour quitter) : ");
            String temp = scanner.next();
            if (temp.equals("exit")){
                run = false;
            }else{
                list.add(temp);
            }

        }

        System.out.println(list);

    }

}
