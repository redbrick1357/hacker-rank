package com.hackerrank.crackingcodinginterview;

import java.util.Scanner;

/**
 * Created by cfeng01 on 03/05/17.
 * Challenge source: https://www.hackerrank.com/challenges/ctci-array-left-rotation
 */
public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dRotations = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, dRotations);
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }

    private static int[] arrayLeftRotation(int[] array, int nElements, int rotations) {

        return null;
    }

}