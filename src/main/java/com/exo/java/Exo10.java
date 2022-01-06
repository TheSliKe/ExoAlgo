package com.exo.java;

import java.util.ArrayList;
import java.util.List;

public class Exo10 {

    public static void main( String[] args ){

        System.out.println("-----élément egaux-----");

        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();

        list1.add("bleu");
        list1.add("rouge");
        list1.add("vert");
        list1.add("jaune");
        list1.add("rose");

        list2.add("bleu");
        list2.add("rouge");
        list2.add("vert");
        list2.add("rose");

        for (Object elem : list1) {
            if (list2.contains(elem)){
                System.out.println(elem);
            }
        }

    }

}
