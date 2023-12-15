package com.example.lib.ex7;

public class EX7 {
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,9};

        int odd = 0, even = 0;

        for (int n: arr) {
            if (n%2==0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of odd: " + odd);
        System.out.println("Number of even: " + even);
    }
}
