package com.hrr.hackerRank.thirthy;

import java.io.InputStream;
import java.util.Scanner;


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15 {
//    https://www.hackerrank.com/challenges/30-linked-list/problem?isFullScreen=true
    public static Node insert(Node head, int data) {
        if (head == null) {
            return new Node(data);
        } else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        InputStream is = Day15.class.getClassLoader().getResourceAsStream("Day15.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}