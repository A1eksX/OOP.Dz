package Seminar2.amphibian;

import Seminar2.RunSpeed;
import Seminar2.Soundable;
import Seminar2.SwimSpeed;
import Seminar2.base.Amphibian;

public class Frog extends Amphibian implements SwimSpeed, Soundable, RunSpeed {
    public Frog (String name){
        super(name);
    }

    public String sound (){
        return "Ква-ква-ква";
    }
    public int getRunSpeed (){
        return 3;
    }
    @Override
    public int runSpeed() {
        return 3;
    }
    @Override
    public String toString (){
        return String.format("Frog: %s, RunSpeed: %d, SwimSpeed: %d Sound: %s", name, getRunSpeed(), getSwimSpeed(), sound());
    }
    @Override
    public int getSwimSpeed() {
        return 10;
    }
    @Override
    public String getSound() {
        return "Ква-ква-ква";
    }


}
