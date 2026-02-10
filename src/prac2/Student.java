package prac2;

import java.util.UUID;

public class Student {
    private final UUID id;
    private final String name;
    private int yearOfStudy;

    public Student(String name, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYear() {
        yearOfStudy++;
    }
}
