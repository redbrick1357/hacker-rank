package com.hackerrank.crackingcodinginterview;

import java.util.Scanner;

/**
 * Created by cfeng01 on 03/05/17.
 * Challenge source: https://www.hackerrank.com/challenges/ctci-bubble-sort
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
    }

    private int sortBubbleSort(int[] ar) {
        int temp;
        int numberOfSwaps = 0;
        for (int i = 0; i < ar.length; ++i) {

            for (int j = 0; j < (ar.length - 1); ++j) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    numberOfSwaps++;
                }
            }
        }
        return numberOfSwaps;
    }
}
