package com.exo.java;

import java.util.Arrays;

public class Exo4 {

    public static void main( String[] args ){

        System.out.println("-----Plus Grand dans array-----");

        int[] array = {1,5,2,8,3};

        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("le plus grand élément est : " + max);

    }

}
