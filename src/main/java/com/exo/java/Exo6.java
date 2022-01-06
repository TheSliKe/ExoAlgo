package com.exo.java;

public class Exo6 {

    public static void main( String[] args ){

        int[] tab1 = {1,2,3,4,5};
        int[] tab2 = {5,4,3,2,1};

        int[] tab3 = new int[5];

        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i] + tab2[i];
        }

        for (int i = 0; i < tab3.length; i++) {
            System.out.println(tab3[i]);
        }

    }

}
