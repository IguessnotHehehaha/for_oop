package lab_1.problem_4;
import prac2.Student;

import java.util.*;

public class GradeBook {
    private Course course;
    private List<Student> students;
    private Map<UUID, Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = new ArrayList<>(students);
        this.grades = new HashMap<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void setGrade(Student student, int grade){
        if(grade < 0 || grade > 100){
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
            return;
        }
        grades.put(student.getId(), grade);
    }

    public void setGrade(UUID studentId, int grade){
        if(grade < 0 || grade > 100){
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
            return;
        }
        grades.put(studentId, grade);
    }

    public Integer getGrade(Student student){
        return grades.get(student.getId());
    }

    public Course getCourse() {
        return course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        System.out.println("Class average is " + String.format("%.2f", determineClassAverage()) + ". " +
                "Lowest grade is " + getLowestGrade() + " (" + getLowestGradeHolder() + "). ");
        System.out.println("Highest grade is " + getHighestGrade() + " (" + getHighestGradeHolder() + ").");
        System.out.println();
        outputBarChart();
    }

    public double determineClassAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public int getLowestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int lowest = 100;
        for (int grade : grades.values()) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public String getLowestGradeHolder() {
        if (grades.isEmpty()) {
            return "N/A";
        }
        int lowest = getLowestGrade();
        for (Student student : students) {
            Integer grade = grades.get(student.getId());
            if (grade != null && grade == lowest) {
                return student.getName() + ", id: " + getStudentNumber(student);
            }
        }
        return "N/A";
    }

    public int getHighestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int highest = 0;
        for (int grade : grades.values()) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public String getHighestGradeHolder() {
        if (grades.isEmpty()) {
            return "N/A";
        }
        int highest = getHighestGrade();
        for (Student student : students) {
            Integer grade = grades.get(student.getId());
            if (grade != null && grade == highest) {
                return student.getName() + ", id:" + getStudentNumber(student);
            }
        }
        return "N/A";
    }

    public void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] distribution = new int[11];

        for (int grade : grades.values()) {
            if (grade == 100) {
                distribution[10]++;
            } else {
                distribution[grade / 10]++;
            }
        }

        String[] ranges = {"00-09:", "10-19:", "20-29:", "30-39:", "40-49:",
                "50-59:", "60-69:", "70-79:", "80-89:", "90-99:", "100:"};

        for (int i = 0; i < ranges.length; i++) {
            System.out.print(ranges[i] + " ");
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private int getStudentNumber(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(student.getId())) {
                return i + 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GradeBook for ").append(course.getName()).append("\n");
        sb.append("Students enrolled: ").append(students.size()).append("\n");
        sb.append("Grades recorded: ").append(grades.size());
        return sb.toString();
    }
}
