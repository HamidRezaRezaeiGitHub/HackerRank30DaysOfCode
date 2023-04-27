package com.hrr.hackerRank.thirthy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day09 {
//    https://www.hackerrank.com/challenges/30-recursion/problem?isFullScreen=true

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here
        if (n == 1) {
            return 1;
        } else {
            return n * Day09.factorial(--n);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Day09.factorial(n);
        System.out.println(result);
        bufferedReader.close();
    }

}
