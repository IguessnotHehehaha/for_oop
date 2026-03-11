package lab2.problem5;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public void setName(String name){this.name = name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public abstract String getSound();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [name=" + name +
                ", age=" + age + ", sound=" + getSound() + "]";
    }
}
