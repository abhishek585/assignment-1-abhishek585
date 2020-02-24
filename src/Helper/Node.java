package Helper;

//Generic Node class
public class Node<T> {
    private T data;         //Data of node
    private Node<T> next;   //Self referential data
    //Getter for data
    public T getData() {
        return data;
    }
}