package lab2.problem5;

public class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }

    @Override
    public String getSound() {return "Chirick";}
}
