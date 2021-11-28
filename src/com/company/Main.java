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
        int data, n ,m ,p;
        Scanner sc = new Scanner(System.in);
        do {


            System.out.println("enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
//                new_node.next = head;
//                head = new_node;
                System.out.println("enter 1 to insert item at beginning , 2 to insert at the end , 3 to insert at the last ");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                   while (temp.next!=null){
                     temp =temp.next;
                       }
                    temp.next=new_node;
                         break;
                    case  3:
p = sc.nextInt();
Node temp1 = head;
for (int i =0;  i<(p-1); i++){
    temp1 = temp1.next;

}
new_node.next = temp1.next;
temp1.next= new_node;
                        break;

                }
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
