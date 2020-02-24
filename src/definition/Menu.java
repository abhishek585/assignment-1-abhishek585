package definition;

import Helper.Node;
import Helper.person;

import java.util.Scanner;

public class Menu {
    private MyLinkedList<person> linkedList;
    private Scanner scan;


    public Menu() {                     //constructor
        scan = new Scanner(System.in);
        linkedList = new MyLinkedList<>();
    }
    public int showChoice() {
        System.out.println("Welcome to Devesh's Contact List App\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +           //method to view choice
                "Press 5 to exit program");
        return scan.nextInt();
    }

}