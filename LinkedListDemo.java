public class LinkedListDemo {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insert(6);
        sll.insert(8);
        sll.insert(1);
        sll.insert(10);

        sll.insertAtPosition(25, 0);

        sll.printList();
    }

}

class SinglyLinkedList {
    Node head;

    // insert at last
    public boolean insert(int data) {
        Node node = new Node(data);
        try {

            if (head == null) {
                head = node;
            } else {
                Node currNode = head;
                while (currNode.next != null) {
                    currNode = currNode.next;
                }
                currNode.next = node;
            }
            return true;
        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
            return false;
        }
    }

    public boolean insertAtPosition(int data, int pos) {
        Node node = new Node(data);

        if (head == null) {
            if (pos > 1) {
                System.out.println("ERROR : position is greater than size of the list");
                return false;
            }
            head = node;
            return true;
        } else {
            Node currNode = head;
            int counter = 0;
            while (currNode.next != null && counter < pos) {
                currNode = currNode.next;
                counter++;
            }
            if (currNode.next == null && counter < (pos - 1)) {
                System.out.println("ERROR : position is greater than size of the list");
                return false;
            } else if (currNode.next != null && counter == pos) {

                if (pos == 0) {
                    node.next = head;
                    head = node;
                    return true;
                } else {
                    node.next = currNode.next;
                    currNode.next = node;
                    System.out.println("Inserted !!!");
                    return true;
                }
            } else {
                System.out.println("ERROR : Something went wrong");
                return false;
            }
        }

    }

    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
