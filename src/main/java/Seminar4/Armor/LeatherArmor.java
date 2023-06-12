package Seminar4.Armor;

public class LeatherArmor implements Armor {

    @Override
    public int protection() {
        return 15;
    }
    @Override
    public String toString() {
        return String.format("LeatherArmor: %s", protection());
    }
}
