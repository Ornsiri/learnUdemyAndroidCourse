package com.example.lib.ex9;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        int [][] mt1 = new int[3][3];
        int [][] mt2 = new int[3][3];
        int [][] sumMt = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix-1 : ");
        for (int i = 0; i<mt1.length; i++) {
            for (int j = 0; j<mt1[0].length; j++ ) {
                mt1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter matrix-2 : ");
        for (int i = 0; i<mt1.length; i++) {
            for (int j = 0; j<mt1[0].length; j++ ) {
                mt2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i<mt1.length; i++) {
            for (int j = 0; j<mt1[0].length; j++ ) {
                sumMt[i][j] = mt1[i][j] + mt2[i][j];
                System.out.print(sumMt[i][j] + " ");
            }
            System.out.println();
        }


    }
}
