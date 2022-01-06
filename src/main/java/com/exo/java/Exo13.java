package com.exo.java;

import java.util.Scanner;

public class Exo13 {

    static String[][] plateau = new String[10][10];
    static Scanner scanner = new Scanner(System.in);
    static boolean run = true;
    static int posX;
    static int posY;

    public static void main( String[] args ){

        System.out.println("-----dame-----");

        clearPlateau();


        askStartPos();


        while (run){
            renderPlateau();
            askMove();


        }

    }

    public static void askMove(){
        System.out.println("0 (en haut à gauche), 1 (en haut à droite), 2 (en bas à gauche), 3 (en bas à droite)");
        int move = scanner.nextInt();

        switch (move){
            case 0:
                clearPlateau();
                posX -= 1;
                posY -= 1;
                checkPos();
                if (run){
                    setPos();
                }
                break;
            case 1:
                clearPlateau();
                posX += 1;
                posY -= 1;
                checkPos();
                if (run){
                    setPos();
                }
                break;
            case 2:
                clearPlateau();
                posX -= 1;
                posY += 1;
                checkPos();
                if (run){
                    setPos();
                }
                break;
            case 3:
                clearPlateau();
                posX += 1;
                posY += 1;
                checkPos();
                if (run){
                    setPos();
                }
                break;
        }
    }

    public static void checkPos(){
        if (posX < 1 || posX > 10){
            run = false;
        }

        if (posY < 1 || posY > 10){
            run = false;
        }
    }

    public static void setPos(){
        plateau[posY - 1][posX - 1] = "X";
    }

    public static void renderPlateau(){
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (x == 9){
                    System.out.println(plateau[y][x]);
                }else {
                    System.out.print(plateau[y][x] + "|");
                }
            }
        }
    }

    public static void clearPlateau(){
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                plateau[y][x] = "O";
            }
        }
    }

    public static void askStartPos(){
        boolean posXRun = true;
        while (posXRun){
            System.out.println("Start posX : ");
            posX = scanner.nextInt();
            if (posX >= 1 && posX<= 10){
                posXRun = false;
            }
        }


        boolean posYRun = true;
        while (posYRun){
            System.out.println("Start posY : ");
            posY = scanner.nextInt();
            if (posY >= 1 && posY<= 10){
                posYRun = false;
            }
        }

        plateau[posY - 1][posX - 1] = "X";
    }


}
