package prac_4;

public class Person implements CanHavePizza{
    String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public void eatPizza(){
        System.out.println(name + "is eating pizza");
    }

    public void pay(){
        System.out.println(name + "paid for the pizza");
    }
}
