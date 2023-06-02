package Seminar2;

import Seminar2.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<Animal> terrarium = new ArrayList<>();
    public Terrarium addTerrarium (Animal animal){
        terrarium.add(animal);
        return this;
    }
    @Override
    public String toString (){
        StringBuilder builder = new StringBuilder ();
        for (Animal item: terrarium) {
            builder.append(item).append("\n");
        }
        return builder.toString();
    }

    private List<SwimSpeed> swimSpeeds(){
        List<SwimSpeed> swimSpeeds = new ArrayList<>();
        for (Animal swimmers: terrarium) {
            swimSpeeds.add((SwimSpeed) swimmers);
        }
        return swimSpeeds;
    }
    public SwimSpeed swimSpeedsChampion (){
        SwimSpeed hero = swimSpeeds().get(0);
        for (SwimSpeed item: swimSpeeds()) {
            if (hero.getSwimSpeed() < item.getSwimSpeed()){
                hero = item;
            }
        }
        return hero;
    }
    private List<Soundable> soundables(){
        List<Soundable> soundables = new ArrayList<>();
        for (Animal item: terrarium) {
            if(item instanceof Soundable){
                soundables.add((Soundable) item);
            }
        }
        return  soundables;
    }
    public String sounds(){
        StringBuilder builder = new StringBuilder();
        for (Soundable sound:soundables()) {
            builder.append(sound.getSound()).append("\n");
        }
        return builder.toString();
    }

    private List<RunSpeed> runSpeeds(){
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal item: terrarium) {
            runners.add((RunSpeed)item);
        }
        return runners;
    }
    public RunSpeed runSpeedChampion (){
        RunSpeed hero = runSpeeds().get(0);
        for (RunSpeed item: runSpeeds()) {
            if (hero.runSpeed() < item.runSpeed()){
                hero = item;
            }
        }
        return hero;
    }
}
