package prac_3;

class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }

    public void eat (String food){
        System.out.println(name + "eats" + food);
    }

    public void eat(String food, int quantity){
        System.out.println(name + " eats " + quantity + " units of " + food);
    }
}

class Cat extends Animal{
    public Cat (String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " says meow");
    }

    public void eat(){
        System.out.println(name + " eats cat food");
    }

    public void callSuperMakeSound(){
        super.makeSound();
    }
}

public class problem_1 {
    public static void main(String[] args){
        Animal genericAnimal = new Animal("GenericAnimal");
        genericAnimal.makeSound();
        genericAnimal.eat("food");
        genericAnimal.eat("food", 2);

        Cat cat = new Cat("Whiskers");
        cat.makeSound();
        cat.eat();
        cat.eat("fish", 3);
        cat.callSuperMakeSound();
    }
}
