package prac_4;

public class Restraunt {
    public boolean servePizza(CanHavePizza eater){
        eater.eatPizza();

        if (eater instanceof Person){
            Person p = (Person) eater;
            p.pay();
        }

        return true;
    }
}
