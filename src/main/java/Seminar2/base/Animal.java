package Seminar2.base;

public abstract class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract String sound ();

    @Override
    public String toString (){
        return String.format("Name: %s", name);
    }
}
