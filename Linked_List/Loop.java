package Linked_List;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Loop {

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating loop
        fourth.next = second;

        Node slow = head;
        Node fast = head;

        boolean hasLoop = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        if (hasLoop)
            System.out.println("Loop Detected");
        else
            System.out.println("No Loop");
    }
}
