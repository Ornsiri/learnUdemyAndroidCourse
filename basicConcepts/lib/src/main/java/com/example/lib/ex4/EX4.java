package com.example.lib.ex4;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String txt = sc.nextLine();
        count(txt);


    }


    public static void count(String txt) {
        int letterCount = 0, spaceCount = 0, specialCount = 0, numberCount = 0;
        char[] txtArr = txt.toCharArray();

        for (int i = 0; i < txtArr.length; i++) {
            if (Character.isLetter(txtArr[i])) {
                letterCount++;
            } else if (Character.isDigit(txtArr[i])) {
                numberCount++;
            } else if (Character.isWhitespace(txtArr[i])) {
                spaceCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Letter : " + letterCount);
        System.out.println("Number : " + numberCount);
        System.out.println("Space : " + spaceCount);
        System.out.println("Special : " + specialCount);
    }
}
