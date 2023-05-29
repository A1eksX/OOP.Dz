package Semirar1;

/*
  Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные:
  1) наименование, 2) объем, 3) температура,4) цена.

  Проинициализировать несколько напитков в классе main и торговый автомат,
  воспроизвести логику продажи напитков. Сделать согласно принципам ООП, пройденным на семинаре.
 */
public class Main {
    public static void main(String[] args) {
        СoffeeMachine apparate = new СoffeeMachine();
        apparate.addDrink(new Drink("Американо", 200, 60, 100))
                .addDrink(new Drink("Каппучино", 180, 55, 70))
                .addDrink(new Drink("Латте", 100, 40, 50))
                .addDrink(new Espresso("Эспрессо", 35, 50, 100, 20));

        System.out.println(apparate.toString());

        System.out.println();
        Drink coffe = apparate.findDrink("Латте");
        System.out.println(coffe);
        System.out.println("----------------------");

        Drink sallCoffee = apparate.saleDrink("Американо");
        System.out.println(sallCoffee);

        Drink sallCoffe2 = apparate.saleDrink("Каппучино");
        System.out.println(sallCoffe2);

        System.out.println("Заработали денег: ");
        System.out.println(apparate.getCash());

        System.out.println(apparate.toString());
    }
}
