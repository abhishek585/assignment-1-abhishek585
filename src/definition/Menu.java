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
}