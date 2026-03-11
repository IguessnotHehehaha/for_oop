package lab2.problem5;

import java.util.Objects;

public class PhDStudent extends Person{
    private String major;
    private String researchTopic;

    public PhDStudent (String name, int age, String major, String researchTopic){
        super(name, age);
        this.major = major;
        this.researchTopic = researchTopic;
    }

    public String getMajor() {return major;}
    public void setMajor(String major) {this.major = major;}

    public String getResearchTopic() {return researchTopic;}
    public void setResearchTopic(String researchTopic) {this.researchTopic = researchTopic;}

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println(getName() + " is a PhD student and cannot have a dog.");
            return;
        }
        super.assignPet(pet);
    }

    @Override
    public String getOccupation() { return "PhD Student in " + major +
            ", researching " + researchTopic; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PhDStudent that = (PhDStudent) o;
        return Objects.equals(major, that.major) && Objects.equals(researchTopic, that.researchTopic);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), major, researchTopic);
    }
}
