package Seminar2.snake;


import Seminar2.RunSpeed;
import Seminar2.Soundable;
import Seminar2.SwimSpeed;
import Seminar2.base.Snake;

public class Viper extends Snake implements SwimSpeed, Soundable, RunSpeed {
    public Viper (String name){
        super(name);
    }

    public String sound(){
        return "Ш-Ш-ш-ш-ш-ш-ш-ш-ш";
    }
    public int getRunSpeed(){
        return 5;
    }
    @Override
    public int runSpeed() {
        return 5;
    }
    public String toString(){
        return String.format("Viper: %s, RunSpeed: %d, SwimSpeed: %d Sound: %s", name, getRunSpeed(), getSwimSpeed(), sound());
    }

    @Override
    public int getSwimSpeed() {
        return 20;
    }

    @Override
    public String getSound() {
        return "Ш-Ш-ш-ш-ш-ш-ш-ш-ш";
    }


}
