package Seminar4.Armor;

public class HeavyArmor implements Armor {
    @Override
    public int protection() {
        return 20;
    }
    @Override
    public String toString() {
        return String.format("HeavyArmor: %s", protection());
    }
}
