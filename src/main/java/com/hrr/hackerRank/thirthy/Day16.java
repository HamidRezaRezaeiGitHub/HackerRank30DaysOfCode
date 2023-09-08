package com.hrr.hackerRank.thirthy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16 {
//    https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem?isFullScreen=true

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        bufferedReader.close();

        try {
            int i = Integer.valueOf(S);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
