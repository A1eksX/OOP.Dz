package Seminar7;

import java.util.Scanner;

public class View {
    private final CalculableFactory calculableFactory;

    public View(CalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
    public void run() {

            while (true) {
                IntCalculations complexCalculator = calculableFactory.create(data());

                while (true) {
                    String cmd = prompt("Введите команду (*, +, =) : ");
                    if (cmd.equals("*")) {
                        complexCalculator.multi(data());
                        continue;
                    }
                    if (cmd.equals("+")) {
                        complexCalculator.sum(data());
                        continue;
                    }

                    if (cmd.equals("=")) {
                        complexCalculator.getResult();
                        break;
                    }
                }break;
            }
    }

    private ComplexNumber data(){
        Scanner iScanner = new Scanner(System.in);
        int [] array = new int[2];
        for (int i = 0; i < array.length; i++){
            System.out.println("Введите  элемент комплексного числа: ");
            array [i] = iScanner.nextInt();
        }
        return new ComplexNumber(array[0], array[1]);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}