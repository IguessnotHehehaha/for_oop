package prac_4;

public class Main {

    public static void main(String[] args){

        Restraunt delpapa = new Restraunt();

        Cat cat = new Cat("KOT");
        Person person = new Person("Josh");
        Student student = new Student("stud");

        delpapa.servePizza(cat);
        delpapa.servePizza(person);
        delpapa.servePizza(student);
    }
}
