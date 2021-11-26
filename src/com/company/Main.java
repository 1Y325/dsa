package com.company;

import java.util.Scanner;

class single_creation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {


            System.out.println("enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;

            }
            System.out.println("do u want to add more data . if yes press1");
            n = sc.nextInt();
        }
        while (n == 1);
    }

    public void traverser() {
        Node temp = head;
        if (head == null) {
            System.out.println("list does not exists");

        }
else{
    while (temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
        }

    }
}

    public class Main {
        public static void main(String[] args) {
single_creation obj1 = new single_creation();
obj1.creation();
obj1.traverser();
        }
    }
