package Seminar4.warriors;

import Seminar4.Armor.LeatherArmor;
import Seminar4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, LeatherArmor>{ //<Ranged> указывает, что Archer может использовать ТОЛЬКО дистанционное оружие
    public Archer(String name, int healthPoint,
                  Ranged weapon, LeatherArmor armor) { //тут автоконструктор предлагает Weapon weapon, я подставил Ranged,
        //т.к. мне надо, чтобы в руки мог брать ТОЛЬКО дистанционное оружие(лук, арбалет)
        super(name, healthPoint, weapon, armor);
    }
    public int distance(){ //дальность прицельной стрельбы
        return super.getWeapon().distance();
           /*
           return ((Ranged)super.getWeapon()).distance();
        обращаемся к базовому классу Warrior, поэтому пишем super, из него вытаскивает метод .getWeapon().
        Говорим, что оружие имеет дистанцию для атаки, для этого делаем DownCast(приводим к типу)
        т.о. super.getWeapon() приводим к типу Ranged, чтобы воспользоваться методом .distance()
             */
    }
    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), distance());
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
