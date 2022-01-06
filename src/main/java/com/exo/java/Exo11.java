package com.exo.java;


import java.util.*;

public class Exo11 {

    public static void main( String[] args ){

        System.out.println("-----doublon-----");

        List list = new ArrayList<>(Arrays.asList(1,5,4,8,7,7,5,9,4,6,8,4,2,3,5,1));

        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }

}
