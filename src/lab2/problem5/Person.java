package lab2.problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public Animal getPet() { return pet; }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }
        if (caretaker.hasPet()) {
            System.out.println(caretaker.getName() + " already has a pet and cannot take another.");
            return;
        }
        if (caretaker instanceof PhDStudent && pet instanceof Dog) {
            System.out.println(caretaker.getName() + " is a PhD student and cannot take care of a dog.");
            return;
        }
        caretaker.assignPet(this.pet);
        this.removePet();
        System.out.println(name + " left " + caretaker.getPet().getName() + " with " + caretaker.getName() + ".");
    }

    public void retrievePetFrom(Person caretaker) {
        if (!caretaker.hasPet()) {
            System.out.println(caretaker.getName() + " has no pet to return.");
            return;
        }
        if (hasPet()) {
            System.out.println(name + " already has a pet.");
            return;
        }
        this.assignPet(caretaker.getPet());
        caretaker.removePet();
        System.out.println(name + " retrieved " + pet.getName() + " from " + caretaker.getName() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        String petInfo = hasPet() ? pet.toString() : "no pet";
        return getClass().getSimpleName() + " [name=" + name + ", age=" + age +
                ", occupation=" + getOccupation() + ", pet=" + petInfo + "]";
    }
}