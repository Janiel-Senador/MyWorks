import java.util.Scanner;

// Singly Linked List Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List class
class SinglyLinkedList {
    Node head;

    // Constructor
    public SinglyLinkedList() {
        this.head = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete from the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // Display all elements
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Search for an element
    public void searchElement(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element " + key + " found in the list.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element " + key + " not found in the list.");
    }

    // Delete an element by key
    public void deleteElement(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the element to be deleted is at the head
        if (head.data == key) {
            head = head.next;
            System.out.println("Element " + key + " deleted.");
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element " + key + " not found in the list.");
            return;
        }

        prev.next = temp.next;
        System.out.println("Element " + key + " deleted.");
    }
}

public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int choice, element;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("0. Terminate the Program");
            System.out.println("1. Insert an Element (Beginning)");
            System.out.println("2. Delete an Element (Beginning)");
            System.out.println("3. Display All Elements");
            System.out.println("4. Search an Element");
            System.out.println("5. Delete an Element by Key");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Terminating the program...");
                    scanner.close();
                    return;
                case 1:
                    System.out.print("Enter the element to insert at the beginning: ");
                    element = scanner.nextInt();
                    list.insertAtBeginning(element);
                    break;
                case 2:
                    list.deleteAtBeginning();
                    break;
                case 3:
                    list.displayList();
                    break;
                case 4:
                    System.out.print("Enter the element to search: ");
                    element = scanner.nextInt();
                    list.searchElement(element);
                    break;
                case 5:
                    System.out.print("Enter the element to delete: ");
                    element = scanner.nextInt();
                    list.deleteElement(element);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
