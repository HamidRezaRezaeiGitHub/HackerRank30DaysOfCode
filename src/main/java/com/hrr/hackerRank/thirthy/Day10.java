package com.hrr.hackerRank.thirthy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
//    https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        String binary = "";
        while (n > 0) {
            binary = String.valueOf(n % 2) + binary;
            n /= 2;
        }
        int max = 0;
        int m = 0;
        boolean consecutive = false;
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                if (consecutive) {
                    m++;
                } else {
                    m = 1;
                    consecutive = true;
                }
            } else {
                consecutive = false;
                m = 0;
            }
            max = m > max ? m : max;
        }
        System.out.println(max);

    }
}
