package com.hackerrank.challenge;

import java.util.Scanner;

/**
 * Created by cfeng01 on 06/05/17.
 * Challenge source: https://www.hackerrank.com/challenges/staircase
 */

public class Staircase {
    public static String buildStairCase(int stairs) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= stairs; i++) {
            for (int spaces = 0; spaces < stairs - i; spaces++) {
                result.append(" ");
            }
            for (int hashes = 0; hashes < i; hashes++) {
                result.append("#");
            }
            if (i < stairs)
                result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(buildStairCase(n));
    }

}
