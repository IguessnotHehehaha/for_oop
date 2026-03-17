package prac_4;

public class Cat extends Animal implements CanHavePizza{

    public Cat(String name){
        super(name);
    }

    @Override
    public void eatPizza(){
        System.out.println(name + "cat is eating pizza");
    }
}
