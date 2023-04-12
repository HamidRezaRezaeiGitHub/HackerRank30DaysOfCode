package com.hrr.hackerRank.thirthy;

import java.io.InputStream;
import java.util.Scanner;


public class Day04 {
//    https://www.hackerrank.com/challenges/30-class-vs-instance/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = Day04.class.getClassLoader().getResourceAsStream("Day04.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            // Person p = new Person(age);
            Day04 p = new Day04(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
        private int age;

        public Day04(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
                age = 0;
            } else {
                age = initialAge;
            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if (age < 13) {
                System.out.println("You are young.");
            } else if (age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }

        public void yearPasses() {
            // Increment this person's age.
            age++;
        }

}