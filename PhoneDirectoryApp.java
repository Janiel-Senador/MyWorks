import java.util.Scanner;


public class PhoneDirectoryApp {
    private static PhoneDirectory[] contacts = new PhoneDirectory[30];     private static int contactCount = 10;     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        initializeContacts();

        while (true) {
            System.out.print("\nEnter a name to search (or type 'quit' to exit): ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("quit")) {
                System.out.println("Exiting program...");
                break;
            }

            int index = findContact(name);
            if (index != -1) {
                System.out.println("Phone Number: " + contacts[index].getPhoneNumber());
            } else {
                if (contactCount < 30) {
                    System.out.print("Name not found. Enter a phone number to add: ");
                    String phoneNumber = scanner.nextLine();
                    addNewContact(name, phoneNumber);
                    System.out.println("New contact added!");
                } else {
                    System.out.println("Phone directory is full. Cannot add more contacts.");
                    break;
                }
            }
        }

        scanner.close();
    }

  
    private static void initializeContacts() {
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hank", "Ivy", "Jack" };
        String[] phoneNumbers = { "111-1111", "222-2222", "333-3333", "444-4444", "555-5555",
                                  "666-6666", "777-7777", "888-8888", "999-9999", "101-1010" };

        for (int i = 0; i < 10; i++) {
            contacts[i] = new PhoneDirectory(names[i], phoneNumbers[i]);
        }
    }

   
    private static int findContact(String name) {
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].getFirstName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;     }
    private static void addNewContact(String name, String phoneNumber) {
        contacts[contactCount] = new PhoneDirectory(name, phoneNumber);
        contactCount++;
    }
}