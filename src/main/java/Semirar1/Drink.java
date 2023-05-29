package Semirar1;

public class Drink {
    private String drinkName;
    private int drinkVolume;
    private int drinkTemperature;
    private double drinkPrice;

    public Drink(String drinkName, int drinkVolume, int drinkTemperature, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkVolume = drinkVolume;
        this.drinkTemperature = drinkTemperature;
        this.drinkPrice = drinkPrice;
    }

    @Override
    public String toString() {
        return String.format("Кофе: %s, Объём: %d, Температура: %d, Стоимость: %f", drinkName, drinkVolume, drinkTemperature, drinkPrice);
    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }
}
