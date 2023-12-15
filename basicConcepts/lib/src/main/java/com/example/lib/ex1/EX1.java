package com.example.lib.ex1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number-1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number-2: ");
        num2 = sc.nextInt();

        float divider = (float) num1 /num2;
        float remainder = num1%num2;

        System.out.println("The n1/n2 = "+ divider);
        System.out.println("The remainder = "+ remainder);


    }
}
