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
    public void addChoice() {
        person person = new person();
        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n");
        scan.nextLine();

        //taking the input from the user

        System.out.println("First Name: ");
        String name = scan.nextLine().

                trim();
        {

        }
        person.setFirstName(name);
        //taking input of first name
        System.out.print("Last Name: ");
        name = scan.nextLine().trim();
        person.setLastName(name);
        //taking input of last name
    }
    }