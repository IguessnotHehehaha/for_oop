package lab_1.problem_5;

public class Person {
    private String name;
    private Gender gender;
    private int age;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.age = 18;
    }

    public Person (String name, Gender gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ", " + age + " years old)";
    }
}
