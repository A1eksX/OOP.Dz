package Seminar4;

//import OOP.Dz.Seminar4.Armor.HeavyArmor;
//import OOP.Seminar4.Armor.LeatherArmor;
//import OOP.Seminar4.warriors.Archer;
//import OOP.Seminar4.warriors.Infantryman;
//import OOP.Seminar4.warriors.Warrior;
//import OOP.Seminar4.weapons.meleeWeapon.Axe;
//import OOP.Seminar4.weapons.meleeWeapon.Sword;
//import OOP.Seminar4.weapons.rangedWeapon.Bow;
//import OOP.Seminar4.weapons.rangedWeapon.CrossBow;


import Seminar4.warriors.Warrior;

public class Battle{
    private Warrior w1;
    private Warrior w2;
    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }
    public void fight(){
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0){

            int dmg1 = w1.hit(); //урон
            int armDef2 = w2.def(); //защита

            int blockDamage1 = (dmg1 < armDef2) ? dmg1 : armDef2;
            int damage1 = (dmg1 < armDef2) ? 0 : (dmg1 - armDef2); //с семинара

            System.out.println("Первый наносит урон второму: " + dmg1 + " Второй блокирует урон: " + blockDamage1 + " Итоговый урон: " +  damage1);
            w2.rediceHealth(damage1, w2.protection());

            int dmg2 = w2.hit(); //урон
            int armDef1 = w1.def(); // защита

            int blockDamage2 = (dmg2 < armDef1) ? dmg2 : armDef1;
            int damage2 = (dmg2 < armDef1) ? 0 : (dmg2 - armDef1);

            System.out.println("Второй наносит урон первому: " + dmg2 + " Первый блокирует урон: " + blockDamage2 + " Итоговый урон: " + damage2);
            w1.rediceHealth(damage2, w1.protection());
            System.out.println(w1);
            System.out.println(w2);
        }
    }

}
//лайт 10; хеви 20  ; 1 хеви  2 лайт
