package Seminar4.weapons.meleeWeapon;

public class Sword implements Melee {
    @Override
    public int damage() {
        return 7;
    }
    public String toString() {
        return String.format("Sword: %s", damage());
    }
}
