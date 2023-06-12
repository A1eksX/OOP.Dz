package Seminar4.weapons.rangedWeapon;

public class Bow implements Ranged{
    @Override
    public int damage() {
        return 30;
    }
    @Override
    public int distance() {
        return 200;
    }
    @Override
    public String toString() {
        return String.format("Bow: %s",damage());
    }
}
