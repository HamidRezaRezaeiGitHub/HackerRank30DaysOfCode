package com.hrr.hackerRank.thirthy;

import java.io.InputStream;
import java.util.Scanner;

public class Day14 {
//    https://www.hackerrank.com/challenges/30-scope/problem?isFullScreen=true

    public static void main(String[] args) {
        InputStream is = Day14.class.getClassLoader().getResourceAsStream("Day14.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int max = elements[0];
        int min = elements[0];
        for (int element : elements) {
            max = max > element ? max : element;
            min = min < element ? min : element;
        }
        this.maximumDifference = max - min;
    }

}