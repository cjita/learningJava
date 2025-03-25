/******************************************************************************

    Contact List Manager: Build a program that reads a list of contacts from a file 
    and allows the 
    user to add new contacts, displaying appropriate error messages for invalid inputs.

*******************************************************************************/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}

public class Main {

    private static final String CONTACTS_FILE = "contacts.txt";

    public static void main(String[] args) {
        List<Contact> contacts = loadContactsFromFile();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nContact List Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact(contacts, scanner);
                    break;
                case 2:
                    displayContacts(contacts);
                    break;
                case 3:
                    saveContactsToFile(contacts);
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static List<Contact> loadContactsFromFile() {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CONTACTS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    contacts.add(new Contact(parts[0], parts[1], parts[2]));
                }
            }
        } catch (FileNotFoundException e) {
            // File doesn't exist yet, that's okay.
        } catch (IOException e) {
            System.err.println("Error loading contacts: " + e.getMessage());
        }
        return contacts;
    }

    private static void saveContactsToFile(List<Contact> contacts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONTACTS_FILE))) {
            for (Contact contact : contacts) {
                writer.write(contact.name + "," + contact.phoneNumber + "," + contact.email);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving contacts: " + e.getMessage());
        }
    }

    private static void addContact(List<Contact> contacts, Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        if (!phoneNumber.matches("\\d+")) {
            System.out.println("Invalid phone number. Use digits only.");
            return;
        }

        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            System.out.println("Invalid email format.");
            return;
        }

        contacts.add(new Contact(name, phoneNumber, email));
        System.out.println("Contact added.");
    }

    private static void displayContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
