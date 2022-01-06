package com.exo.java;


public class Exo8 {

    public static void main( String[] args ){

        System.out.println("-----élément egaux-----");

        String[] list1 = {"bleu", "rouge", "vert", "jaune", "rose"};
        String[] list2 = {"bleu", "rouge", "vert", "rose", "violet"};

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])){
                    System.out.println(list1[i]);
                }
            }
        }
    }

}
