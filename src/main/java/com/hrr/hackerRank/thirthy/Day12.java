package com.hrr.hackerRank.thirthy;

import java.io.InputStream;
import java.util.Scanner;

class Day12 {
//    https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true

    public static void main(String[] args) {
        InputStream is = Day12.class.getClassLoader().getResourceAsStream("Day12.txt");
        Scanner scan = new Scanner(is);
//        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int sum = 0;
        for (int i : testScores) {
            sum += i;
        }
        int ave = sum / testScores.length;
        if (ave < 40) return 'T';
        else if (ave < 55) return 'D';
        else if (ave < 70) return 'P';
        else if (ave < 80) return 'A';
        else if (ave < 90) return 'E';
        else return 'O';
    }
}