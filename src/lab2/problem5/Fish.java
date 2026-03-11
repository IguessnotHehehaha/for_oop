package lab2.problem5;

public class Fish extends Animal{
    public Fish(String name, int age){
        super(name, age);
    }

    @Override
    public String getSound() {return "Bulp";}
}
