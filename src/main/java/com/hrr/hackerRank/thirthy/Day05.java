package com.hrr.hackerRank.thirthy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day05 {
//    https://www.hackerrank.com/challenges/30-loops/problem?isFullScreen=true
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i=1; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + i*n);
        }
        bufferedReader.close();
    }

}
