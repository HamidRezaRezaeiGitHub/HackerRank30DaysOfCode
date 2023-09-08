package com.hrr.hackerRank.thirthy;

import java.io.InputStream;
import java.util.Scanner;

public class Day17 {
//    https://www.hackerrank.com/challenges/30-more-exceptions/problem?isFullScreen=true

    public static void main(String[] args) {
        InputStream is = Day17.class.getClassLoader().getResourceAsStream("Day17.txt");
        Scanner in = new Scanner(is);
//        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}