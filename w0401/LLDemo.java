package w0401;

import java.util.LinkedList;

public class LLDemo {
    public static void main(String[] args) {

        // Node n1 = new Node(3);
        // Node n2 = new Node(10);
        // Node n3 = new Node(7);

        // n2.next = n3;
        // n1.next = n2;

        // // printLLIter(n1);
        // // printLLRec(n1);
        // printLLRecReverse(n1);

        MyNode mn = new MyNode(5);
        Node n = mn; // A raw type - compiler throws an unchecked warning
        n.setData("Hello"); // Causes a ClassCastException to be thrown.
        Integer x = mn.data;
    }

    static void printLLIter(Node head) {
        var tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    static void printLLRec(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        printLLRec(head.next);
    }

    static void printLLRecReverse(Node head) {
        if (head == null)
            return;
        printLLRecReverse(head.next);
        System.out.print(head.data + " ");
    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    T getData() {
        return this.data;
    }

    void setData(T data) {
        this.data = data;
    }
}

class MyNode extends Node<Integer> {
    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}