package com.hackerrank.challenge.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by cfeng01 on 02/05/17.
 */
public class Day04ClassVsInstance {
    private int age;

    public void Person(int initialAge) {
        if(initialAge<0){
            System.out.println("Age is not valid, setting age to 0.");
            initialAge=0;
        }
        age = initialAge;
    }

    public void amIOld() {
        String message;
        // Write code determining if this person's age is old and print the correct statement:
        if(age<13)
            message = "You are young.";
        else if(age>=13 && age < 18)
            message = "You are a teenager.";
        else
            message = "You are old.";
        System.out.println(message);
    }

    public void yearPasses() {
        ++age;
    }

}
