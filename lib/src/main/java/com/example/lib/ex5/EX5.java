package com.example.lib.ex5;

import java.util.Arrays;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String txt = input.nextLine();
        reversedString(txt);

    }

    public static void reversedString(String txt) {
        int j = 0;
        char [] txtArr = txt.toCharArray();
        char [] txtReverse = new char[txtArr.length];
        for (int i = txtArr.length-1; i>=0; i--) {
            txtReverse[j] = txtArr[i];
            j++;
        }

        System.out.print("The reversed : ");

        for (char c: txtReverse) {
            System.out.print(c);
        }

    }
}
