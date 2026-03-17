package prac_4;

public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void breath(){
        System.out.println(name + "is breathing");
    }

    public void move(){
        System.out.println(name + "is moving");
    }
}
