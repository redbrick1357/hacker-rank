package com.hackerrank.crackingcodinginterview;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by cfeng01 on 03/05/17.
 * Challenge source: https://www.hackerrank.com/challenges/ctci-balanced-brackets
 */
public class StacksMatchingBrackets {
    private static final Character OPENING_BRACKET_1 = '(';
    private static final Character CLOSING_BRACKET_1 = ')';
    private static final Character OPENING_BRACKET_2 = '{';
    private static final Character CLOSING_BRACKET_2 = '}';
    private static final Character OPENING_BRACKET_3 = '[';
    private static final Character CLOSING_BRACKET_3 = ']';

    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        boolean result = true;
        Character currentChar;

        for (int i = 0; i < expression.length(); i++) {
            currentChar=expression.charAt(i);
            if (currentChar == OPENING_BRACKET_1) {
                stack.push(CLOSING_BRACKET_1);
            } else if (currentChar == OPENING_BRACKET_2) {
                stack.push(CLOSING_BRACKET_2);
            } else if (currentChar == OPENING_BRACKET_3) {
                stack.push(CLOSING_BRACKET_3);
            } else { /* working for the closing brackets scenarios */
                if (currentChar == CLOSING_BRACKET_1 || currentChar == CLOSING_BRACKET_2 || currentChar == CLOSING_BRACKET_3) {
                    if (stack.isEmpty()) {
                        result = false;
                    } else {
                        Character b = stack.pop();
                        result = b == currentChar;
                    }
                    if (!result) {
                        break;
                    }

                }
            }
        }
        /**/
        if(!stack.isEmpty()){
            // there are pending brackets [to be closed]
            result=false;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
        in.close();
    }
}
