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

        String number;
        System.out.print("Contact Number: ");
        number = scan.nextLine().trim();
        person.setPhoneNumbers(number);
        //input of contact number
        char c;
        System.out.print("Would you like to add another contact number? (y/n): ");
        c = scan.nextLine().trim().charAt(0);
        while (c == 'y') {
            System.out.print("Contact Number: ");
            number = scan.nextLine().trim();
            person.setPhoneNumbers(number);

            System.out.print("Would you like to add another contact number? (y/n): ");
            c = scan.nextLine().trim().charAt(0);
            //input to add another contact number
        }
        String email = null;
        System.out.print("Would you like to add email address? (y/n): ");
        c = scan.nextLine().trim().charAt(0);
        if (c == 'y') {
            System.out.print("Email Address: ");
            email = scan.nextLine().trim();
            person.setEmailID(email);
            System.out.println("y");
        } else {
            person.setEmailID("");
            System.out.println("n");
        }

        Node<person> node =new Node<>();
        Node.setData(person);
        linkedList.insert((Helper.Node<person>)node);        //connection
    }
    private void sortList(MyLinkedList<person> linkedList){
        linkedList.sort();
    }
    //viewing the conditions
    public void viewChoice() {
        sortList(linkedList);
        while(true){
            Node<person> node = linkedList.getObject();
            if(node==null)
                break;
            System.out.println(node.getData());
        }
    }
    }
