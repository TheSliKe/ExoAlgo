package com.exo.java;

public class Exo3 {

    public static void main( String[] args ){

        System.out.println("-----FizzBuzz-----");

        for (int i = 0; i <= 35; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }

}
