package com.hrr.hackerRank.thirthy;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08 {
//    https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = Day08.class.getClassLoader().getResourceAsStream("Day08.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            phoneBook.put(line[0], Integer.valueOf(line[1]));
        }
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }

}
