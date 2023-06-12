package Seminar4.warriors;

import Seminar4.Armor.HeavyArmor;
import Seminar4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, HeavyArmor> {//<Melee> указывает, что Infantryman может использовать ТОЛЬКО оружие ближнего боя
    public Infantryman(String name, int healPoint, Melee weapon, HeavyArmor armor) {

        super(name, healPoint, weapon, armor);
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public int protection() {
        return 0;
    }
}
