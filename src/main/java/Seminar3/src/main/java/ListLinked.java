package Seminar3.src.main.java;

import java.util.Iterator;
/*
    Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс.
    Список должен содержать элементы со ссылкой на следующий элемент (если показалось мало,
    то реализовать ссылку и на предыдущий элемент)
 */
public class ListLinked implements Iterable<Object>{
    private int size = 0;
    private Node head;
    private Node tail;

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<>() {
            final Node firstNode = new Node("0");
            {
                firstNode.setNext(head);
            }
            Node currentElement = firstNode;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public Object next() {
                currentElement = currentElement.getNext();
                return currentElement.getData();
            }
        };
    }

    private Node getElement(int index){
        if (index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node result = head;
        for (int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    public Object get(int index){

        Node element = getElement(index);

        return element.getData();
    }
    public void remove(int index){

        Node currentElement = getElement(index);
        Node nextElement = currentElement.getNext();
        Node previousElement = currentElement.getPrevious();

        if (index == 0){
            head = nextElement;
            if (tail == currentElement){
                tail = null;
            }
        }

        if (index == size - 1){
            tail = previousElement;
            if (head == currentElement){
                head = null;
            }
        }
        size--;

        if (nextElement != null){
            nextElement.setPrevious(previousElement);
        }

        if (previousElement != null){
            previousElement.setNext(nextElement);
        }
    }

    public void add(int index, Object data){
        if (size == index){
            add(data);
            return;
        }
        size++;

        Node currentElement = new Node(data);

        if (index == 0){
            head = currentElement;
        }

        Node nextElement = getElement(index);
        Node previousElement = nextElement.getPrevious();

        currentElement.setNext(nextElement);
        currentElement.setPrevious(previousElement);

        if (previousElement != null) {
            previousElement.setNext(currentElement);
        }
    }
    public void add(Object data){

        Node element = new Node(data);
        if (head == null){
            head = element;
            tail = element;
        }
        if (tail == null) {
            tail = element;
        }
        tail.setNext(element);
        element.setPrevious(tail);
        tail = element;
        size++;
    }
}