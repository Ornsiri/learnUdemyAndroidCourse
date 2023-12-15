package com.example.lib.ex10;

public class EX10 {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,5,7,9,8};

        int sum = 0;
        for (int i = 0; i<numbers.length; i++) {
            sum+=numbers[i];
        }

        double avg = (double) sum/numbers.length;

        System.out.println("The average numbers of arrays: " + avg);
    }
}
