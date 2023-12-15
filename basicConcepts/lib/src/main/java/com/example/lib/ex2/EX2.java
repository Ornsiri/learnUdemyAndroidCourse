package com.example.lib.ex2;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = 0;

        System.out.print("Enter radius: ");
        r = sc.nextDouble();

        double area = Math.PI * r * r;
        double perimeter = Math.PI * r * 2;
        System.out.println("The area of circle is " + area);
        System.out.println("The perimeter of circle is " + perimeter);
    }
}
