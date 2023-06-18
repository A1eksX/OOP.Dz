package Seminar6;

public class Persister implements Save {
    private User user;

    public Persister(User user){  //Конструктор
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}