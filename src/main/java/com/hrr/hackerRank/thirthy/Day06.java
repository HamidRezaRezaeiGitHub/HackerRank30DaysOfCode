package com.hrr.hackerRank.thirthy;

import java.util.Scanner;

public class Day06 {
    //    https://www.hackerrank.com/challenges/30-review-loop/problem?isFullScreen=true
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String inputStr = sc.nextLine();
            String evenStr = "";
            String oddStr = "";
            for (int j = 0; j < inputStr.length(); j++) {
                if (j % 2 == 0) {
                    evenStr += inputStr.charAt(j);
                } else {
                    oddStr += inputStr.charAt(j);
                }
            }
            System.out.println(evenStr + " " + oddStr);
        }
    }
}
