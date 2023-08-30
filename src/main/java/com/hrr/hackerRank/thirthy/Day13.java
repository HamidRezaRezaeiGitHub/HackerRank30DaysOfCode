package com.hrr.hackerRank.thirthy;

import java.io.InputStream;
import java.util.Scanner;

public class Day13 {
//    https://www.hackerrank.com/challenges/30-abstract-classes/problem?isFullScreen=true

    public static void main(String[] args) {
        InputStream is = Day13.class.getClassLoader().getResourceAsStream("Day13.txt");
        Scanner scanner = new Scanner(is);
//        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


