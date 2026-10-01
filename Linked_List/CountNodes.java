package Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CountNodes {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Nodes: " + count);
    }
}
