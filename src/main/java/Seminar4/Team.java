package Seminar4;
/*
Добавить метод определения минимального щита члена команды в команде.
 */


import Seminar4.warriors.Archer;
import Seminar4.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> { // если я укажу <T extends Warrior>, то в дальнейшем
                // можно будет использовать методы типа Warrior, применяем тут -> hpTeam += unit.getHealthPoint(). В этом
                // месте я смог использовать .getHealthPoint(), а без extends Warrior - не смогу.
    List<T> team = new ArrayList<>();
    public void add(T element){ //заполняем список команды
        team.add(element);
    }
    @Override
    public Iterator<T> iterator() {
        return team.iterator(); // т.к. team у нас List, то можно сразу использовать .iterator()
    }
    // написать метод дальность стрельбы и сумма дамага
    public int getTeamHealth(){ // считаем общее ХП команды
        int hpTeam = 0;
        for (T unit: this) { //эта запись означает, что мы перебираем все элементы из private List<T> team = new ArrayList<>();
            hpTeam += unit.getHealthPoint();
        }
        return hpTeam;
    }
    public int maxAttackDistance(){
        int maxDistance = 0;
        for (T item: this) { //эта запись означает, что мы перебираем все элементы из private List<T> team = new ArrayList<>();
            if (!(item instanceof Archer)) { // если item не соответствует типу Archer,...
                continue; // ...то переходим к следующей записи
            }
            int currentDistance = ((Archer) item).distance(); //создание переменной, позволяет избежать лишнего вызова метода (экономит ресурсы)
            if (maxDistance < currentDistance) {
                maxDistance = ((Archer) item).distance();
            }
        }
        return maxDistance;
    }
    public int getTeamAttack (){
        int teamAttack = 0;
        for (T item: this) {
            teamAttack += item.getWeapon().damage();//item.getWeapon().damage() - обращение к оружию конкретного воина, и получение урона оружия
        }
        return teamAttack;
    }
    public int getMinArmor(){
        int minArmor = 2147483647;
        for(T item: this){
            if (item.getArmor().protection() < minArmor){
                minArmor = item.getArmor().protection();
            }
        }
        return minArmor;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T item:this) {
            builder.append(item).append("\n");
        }
        builder.append(String.format("TeamAttack: %d ", getTeamAttack()));
        builder.append(String.format("MaxDistance: %d ", maxAttackDistance()));
        builder.append(String.format("TeamHealth: %d ", getTeamHealth()));
        builder.append(String.format("MinArmor: %d ", getMinArmor()));
        return builder.toString();
    }
}
