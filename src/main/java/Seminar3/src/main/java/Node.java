package Seminar3.src.main.java;

public class Node {

    Object data;
    private Node next;
    private Node previous;

    public Node(Object data) {
        this.data = data;
    }
    public Object getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    void setNext(Node element){
        next = element;
    }
    void setPrevious(Node element){
        previous = element;
    }
    public Node getPrevious() {
        return previous;
    }
}