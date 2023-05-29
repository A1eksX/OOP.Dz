package Semirar1;

public class Espresso extends Drink {
    private int calories;

    public Espresso(String productName, int productVolume, int productTemperature, double productPrice, int calories) {
        super(productName, productVolume, productTemperature, productPrice);
        this.calories = calories;
    }

    @Override
    public String toString() {

        return String.format("Напиток: %s, Калорийность: %d", super.toString(), calories);
    }
}
