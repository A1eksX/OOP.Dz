package Seminar4.weapons.meleeWeapon;

public class Axe implements Melee {
    @Override
    public int damage() {
        return 20;
    }
    public String toString() {
        return String.format("Axe: %s", damage());
    }
}
