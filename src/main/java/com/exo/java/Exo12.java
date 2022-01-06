package com.exo.java;

import java.util.*;
import java.util.stream.Collectors;

public class Exo12 {

    public static void main( String[] args ){

        System.out.println("-----Dédoublonner-----");

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,5,4,8,7,7,5,9,4,6,8,4,2,3,5,1));

        list.stream().filter(i -> Collections.frequency(list, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }

}
