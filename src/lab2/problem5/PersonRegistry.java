package lab2.problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people;

    public PersonRegistry(){
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public void removePerson(Person person){
        people.remove(person);
    }

    public List<Person> findPeopleWithPets(){
        List<Person> result = new ArrayList<>();
        for (Person p: people){
            if(p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> findPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (!p.hasPet()) result.add(p);
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Person Registry\n");
        for (Person p : people) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
