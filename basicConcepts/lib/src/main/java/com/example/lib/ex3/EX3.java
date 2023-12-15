package com.example.lib.ex3;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int decimalNum, quot, i = 1, j;
        int bin_num[] = new int[100];

        System.out.print("Enter the decimal number: ");
        decimalNum = sc.nextInt();

        quot = decimalNum;

        while (quot != 0) {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }

        System.out.println("Binary number is: ");
        for (j=i-1; j>0; j--) {
            System.out.print(bin_num[j]);
        }

    }
}
