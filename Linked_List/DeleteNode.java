package Linked_List;

    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteNode {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int key = 20;

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == key) {
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

