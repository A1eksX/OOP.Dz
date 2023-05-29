package Semirar1;

import java.util.ArrayList;
import java.util.List;

public class СoffeeMachine {

    private List<Drink> drinks = new ArrayList<>();

    private double cash = 0;

    public СoffeeMachine addDrink(Drink coffeeDrinks){  //создал метод, который заполняет и возвращает...
        drinks.add(coffeeDrinks);            //...список с напитками - drinks
        return this;
    }
    public List<Drink> getDrinks() {
        return drinks;
    }

    public double getCash() {
        return cash;
    }

    public Drink findDrink (String name){
        for (Drink temp: drinks) {
            if (name.equals(temp.getDrinkName())){
                return temp;
            }
        }
        return null;
    }

    public Drink saleDrink (String nameCoffee){
        Drink founded = findDrink(nameCoffee);
        if (founded != null){
            cash = cash + founded.getDrinkPrice();
            drinks.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("В автомате: ").append(cash).append("\n");
        for (Drink temp: drinks) {
            builder.append(temp).append("\n");
        }
        return builder.toString();
    }
}
