package Seminar3.src.main.java;

/*
    Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс.
    Список должен содержать элементы со ссылкой на следующий элемент (если показалось мало,
    то реализовать ссылку и на предыдущий элемент)
 */

public class Main {
    public static void main(String[] args) {
        ListLinked list = new ListLinked();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(2, "333333333333333333333");


        System.out.println("-------addNode-------");
        for (Object item: list) {
            System.out.println(item);
        }
        System.out.println("------removeNode--------");
        list.remove(2);
        for (Object item:list) {
            System.out.println(item);
        }

        System.out.println("-------clearList--------");
        list.clear();
        System.out.println(list.size());
    }
}