package Linked_List;

    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SearchNode {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int key = 20;
        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                System.out.println("Found");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Not Found");
    }
}
