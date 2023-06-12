package Seminar4.warriors;

import Seminar4.Armor.Armor;
import Seminar4.weapons.Weapon;

import java.util.Random;

/*
1. Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint.
   Сделать конструктор и сеттеры/геттеры на поля
   В классе Warrior добавить метод hit(), который на основе метода от Weapon.damage() будет считать,
   сколько урона нанес воин сопернику (воин может и промахнуться)
 */
public abstract class Warrior<W extends Weapon, A extends Armor> implements Weapon, Armor { // поставив тут <W extends Weapon>, мы указываем, что...
                // ... лучники могут брать ТОЛЬКО дистанционное оружие, Мили - ТОЛЬКО ближнего боя
        private final String name;
        private int healthPoint;
        private W weapon;   //W СТРОГО указывает,
        private A armor;

    public Warrior(String name, int healthPoint, W weapon, A armor) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armor = armor;
    }

    public A getArmor() {
        return armor;
    }

    public void setArmor(A armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
    public int hit(){
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0, weapon.damage());    //случайный урон от 1 до урона оружием
        return hitDamage;
    }
    public int def(){
        return armor.protection();
    }
    public int defShield(){
        return armor.protection();
    }

    public void rediceHealth (int damage, int armor){  //получение урона
        healthPoint -= (damage - armor );
        if (healthPoint < 0){
            healthPoint = 0;    //чтобы не было отрицательных значений HP
        }
    }
    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d, Armor: %s", name, weapon, healthPoint, armor); //можно ли тут использовать getWeapon и getHealPoint??????
    }
}
