package Seminar2.snake;

import Seminar2.base.Animal;
import Seminar2.RunSpeed;
import Seminar2.Soundable;
import Seminar2.SwimSpeed;


public class Anaconda extends Animal implements SwimSpeed, Soundable, RunSpeed {
    public Anaconda (String name){
        super(name);
    }

    public String sound(){
        return "Хш-шх-шш-хшш";
    }

    public int getRunSpeed (){
        return 10;
    }
    @Override
    public int runSpeed() {
        return 10;
    }
    @Override
    public String toString (){
        return String.format("Anaconda: %s, RunSpeed: %d, SwimSpeed: %d, Sound: %s", name, getRunSpeed(), getSwimSpeed(), sound());
    }

    @Override
    public int getSwimSpeed() {
        return 30;
    }

    @Override
    public String getSound() {
        return "Хш-шх-шш-хшш";
    }


}
