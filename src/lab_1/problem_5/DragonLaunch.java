package lab_1.problem_5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople;

    public DragonLaunch(){
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p){
        kidnappedPeople.add(p);
    }

    public boolean willDragonEatOrNot(){
        if(kidnappedPeople.isEmpty()){
            return false;
        }
        int unpairedBoys = 0;
        int unpairedGirls = 0;

        for (Person p : kidnappedPeople) {
            if (p.getGender() == Gender.BOY) {
                unpairedBoys++;
            } else {
                if (unpairedBoys > 0) {
                    unpairedBoys--;
                } else {
                    unpairedGirls++;
                }
            }
        }

        int totalRemaining = unpairedBoys + unpairedGirls;

        if(totalRemaining > 0){
            System.out.println("Dragon will eat" + totalRemaining);
            return true;
        }
        else{
            System.out.println("Dragon will not lunch");
            return false;
        }
    }

    public Vector<Person> getKidnappedPeople() {
        return new Vector<>(kidnappedPeople);
    }

    public void displayLine() {
        System.out.print("Current line: ");
        for (Person p : kidnappedPeople) {
            System.out.print(p.getGender() == Gender.BOY ? "B" : "G");
        }
        System.out.println(" (length: " + kidnappedPeople.size() + ")");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dragon's Prison Line:\n");
        if (kidnappedPeople.isEmpty()) {
            sb.append("  (empty)");
        } else {
            for (int i = 0; i < kidnappedPeople.size(); i++) {
                Person p = kidnappedPeople.get(i);
                sb.append("  ").append(i + 1).append(". ").append(p.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
