
package com.example.lib.ex6;

import java.util.Arrays;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,-5,4};
        int[] arr2 = {1,4,-5,-2};
        int[] sumArr = new int [arr1.length];
        for(int i = 0; i<arr1.length ; i++) {
            int sum = arr1[i] * arr2[i];
            sumArr[i] = sum;
        }


        System.out.println(Arrays.toString(sumArr));
    }



}
