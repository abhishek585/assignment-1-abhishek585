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
    public Node<T> getIter() {
        return iter;
    }                //Getter for iter
    public void setIter(Node<T> iter) {
        this.iter = iter;
    }  //Setter for iter
    //method to insert new node
    public void insert(Node<T> node) {
        if (getHead() == null) {
            setHead(node);
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }
}