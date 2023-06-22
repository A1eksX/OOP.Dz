package Seminar7;

public class Main {
    public static void main(String[] args) {
        CalculableFactory calculableFactory = new CalculableFactory(new Log());
        View view = new View(calculableFactory);
        view.run();
    }
}
