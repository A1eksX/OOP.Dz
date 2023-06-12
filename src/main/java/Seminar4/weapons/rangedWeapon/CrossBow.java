package Seminar4.weapons.rangedWeapon;

public class CrossBow implements Ranged{
    @Override
    public int damage() {
        return 30;
    }
    @Override
    public int distance() {
        return 350;
    }
    @Override
    public String toString() {
        return String.format("CrossBow: %s",damage());
    }
}
