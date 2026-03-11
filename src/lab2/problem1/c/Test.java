package lab2.problem1.c;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {

        HashSet<Animal> animals = new HashSet<>();
        animals.add(new Animal("Buddy", "Dog"));
        animals.add(new Animal("Whiskers", "Cat"));
        animals.add(new Animal("Buddy", "Dog"));

        System.out.println("Animals in set (expected 2): " + animals.size());
        for (Animal a : animals) {
            System.out.println("  " + a);
        }

        HashSet<Pet> pets = new HashSet<>();
        pets.add(new Pet("Buddy", "Dog", "Alice"));
        pets.add(new Pet("Buddy", "Dog", "Bob"));
        pets.add(new Pet("Buddy", "Dog", "Alice"));

        System.out.println("\nPets in set (expected 2): " + pets.size());
        for (Pet p : pets) {
            System.out.println("  " + p);
        }

        Animal a1 = new Animal("Rex", "Dog");
        Animal a2 = new Animal("Rex", "Dog");
        System.out.println("\na1.equals(a2): " + a1.equals(a2));

        Pet p1 = new Pet("Rex", "Dog", "John");
        Pet p2 = new Pet("Rex", "Dog", "John");
        System.out.println("p1.equals(p2): " + p1.equals(p2));
    }
}
