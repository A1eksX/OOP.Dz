package Seminar2.amphibian;

import Seminar2.RunSpeed;
import Seminar2.SwimSpeed;
import Seminar2.base.Amphibian;

public class Triton extends Amphibian implements SwimSpeed, RunSpeed {
    public Triton (String name){
        super(name);
    }

    @Override
    public String sound() {
        return null;
    }
    public int getRunSpeed (){
        return 25;
    }
    @Override
    public int runSpeed() {
        return 25;
    }
    @Override
    public String toString (){
        return String.format("Triton: %s, RunSpeed: %d, SwimSpeed: %d", name, getRunSpeed(), getSwimSpeed(), sound());
    }
    @Override
    public int getSwimSpeed() {
        return 5;
    }


}
