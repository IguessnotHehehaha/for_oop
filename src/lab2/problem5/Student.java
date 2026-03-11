package lab2.problem5;

import java.util.Objects;

public class Student extends Person{
    private String major;

    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }

    public String getMajor() {return major;}
    public void setMajor(String major) {this.major = major;}

    @Override
    public String getOccupation() { return "Student majoring in " + major; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(major, student.major);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), major);
    }
}

