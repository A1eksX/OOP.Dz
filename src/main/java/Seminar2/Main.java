package Seminar2;


import Seminar2.amphibian.Frog;
import Seminar2.amphibian.Triton;
import Seminar2.base.Animal;
import Seminar2.snake.Anaconda;
import Seminar2.snake.Viper;

// Написать аквариум, или террариум по аналогии с зоопарком. Добавить интерфейс - скорость плавания
public class Main {
    public static void main(String[] args) {
        Animal viper = new Viper("ЗОЯ");
        Animal anaconda = new Anaconda("Обнимашка");
        Animal frog = new Frog("Квакуша");

        Terrarium terrarium = new Terrarium();
        terrarium.addTerrarium(viper)
                .addTerrarium((anaconda))
                .addTerrarium(frog)
                .addTerrarium(new Triton("Шустрый"));

        System.out.println(terrarium);
        System.out.println("------Swims-Champ--------");
        System.out.println(terrarium.swimSpeedsChampion());
        System.out.println("---------Sounds------------");
        System.out.println(terrarium.sounds());
        System.out.println("-------Runner-champion------");
        System.out.println(terrarium.runSpeedChampion());

    }
}
