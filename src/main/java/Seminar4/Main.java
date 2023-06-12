package Seminar4;

import Seminar4.Armor.HeavyArmor;
import Seminar4.Armor.LeatherArmor;
import Seminar4.warriors.Archer;
import Seminar4.warriors.Infantryman;
import Seminar4.warriors.Warrior;
import Seminar4.weapons.meleeWeapon.Axe;
import Seminar4.weapons.meleeWeapon.Sword;
import Seminar4.weapons.rangedWeapon.Bow;
import Seminar4.weapons.rangedWeapon.CrossBow;

/*
   Задание 1.
1. Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint.
   Сделать конструктор и сеттеры/геттеры на поля
2. Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон оружием.
   В классе Warrior добавить метод hit(), который на основе метода от Weapon.damage() будет считать,
   сколько урона нанес воин сопернику (воин может и промахнуться)
3. На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п.
   У лучника добавить поле расстояние поражения.
4. Создать различные виды вооружения, например, меч, лук, лопата. Обеспечить, чтобы определенный тип
   воина мог нести только определенной оружие. Можно на определенное оружие добавить уникальные признаки,
   например, у лука - дальность стрельбы. Сделать метод у лучника: дальность прицельной стрельбы на основе
   лука (дальность прицельной стрельбы лучника меньше дальности полета стрелы из лука)

   Задание 2.
1. Создать команду, которая будет содержать командира и обобщенный тип воинов, только лучников,
   меченосцев, всех подряд, но только унаследованных от Warrior
2. Создать итератор на класс команды, который перебирает всех участников команды
3. Написать методы (подумать куда их можно вставить), которые определяют сумму поражений от всех участников,
  сумму healthPoint и максимальное расстояние поражения. Если в команде нет лучников, то расстояние поражения
  считать равным 0.
 */
public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>(); // делаем команду воинов, пишем Team<Warrior> (лучники тоже воины)
        team1.add(new Archer("Robin", 100, new Bow(), new LeatherArmor())); //дали в руки лук
        team1.add(new Infantryman("John", 200, new Axe(), new HeavyArmor()));

        Team<Archer> teamArchers = new Team<>(); // тут ТОЛЬКО лучники, поэтому Team<Archer>
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new LeatherArmor()));
        teamArchers.add(new Archer("Pitter", 100, new Bow(), new LeatherArmor()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("Jons", 200, new Sword(), new HeavyArmor()));

        System.out.println(team1);
        System.out.println("-------------");
        System.out.println(teamArchers);
        System.out.println("-------------");
        System.out.println(teamInfantryman);
        System.out.println("-------------");

        Battle battle1 = new Battle(new Infantryman("John", 200, new Axe(), new HeavyArmor()),
                                    new Archer("Robin", 100, new Bow(), new LeatherArmor()));
        battle1.fight();

    }

}
