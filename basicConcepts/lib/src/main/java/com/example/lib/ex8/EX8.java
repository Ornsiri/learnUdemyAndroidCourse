
package com.example.lib.ex8;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,x,n,s;
        System.out.print("Enter number of rows: ");
        n = input.nextInt();
        s = n+4-1;
        for (i = 1; i<=n; i++) { // Rows
            for (x = s; x != 0; x--) { // Spaces
                System.out.print(" ");
            }

            for (j = 1; j<=i; j++) { // Numbers
                System.out.print(i + " ");
            }
            System.out.println("");
            s--;
        }
    }
}
