package definition;

import Helper.Node;

public class MyLinkedList<T extends  Comparable<T>> {
    private Node<T> head;           //It is the beginning of linked list
    private Node<T> iter;           //It is used to iterate the list

    public Node<T> getHead() {
        return head;
    }        //getter for head
    public void setHead(Node<T> node) {
        head = node;
        iter = head;
    }   //setter for head

}