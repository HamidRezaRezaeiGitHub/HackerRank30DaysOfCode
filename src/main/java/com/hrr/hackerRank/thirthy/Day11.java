package com.hrr.hackerRank.thirthy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Day11 {
//    https://www.hackerrank.com/challenges/30-2d-arrays/problem?isFullScreen=true

    public static void main(String[] args) throws IOException {
        InputStream is = Day11.class.getClassLoader().getResourceAsStream("Day11.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int width = 6;
        int height = 6;
        int max = (3 + 1 + 3) * (-9);
        for (int i = 0; i < height - 2; i++) {
            for (int j = 0; j < width - 2; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                sum += arr.get(i + 1).get(j + 1);
                sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                max = max > sum ? max : sum;
            }
        }
        System.out.println(max);
    }
}
