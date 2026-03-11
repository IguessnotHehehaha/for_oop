package lab2.problem1.c;

import java.util.Objects;

public class Pet extends Animal {
    private String ownerName;

    public Pet(String name, String species, String ownerName) {
        super(name, species);
        this.ownerName = ownerName;
    }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(ownerName, pet.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ownerName);
    }

    @Override
    public String toString() {
        return "Pet [name=" + getName() + ", species=" + getSpecies() + ", owner=" + ownerName + "]";
    }
}
