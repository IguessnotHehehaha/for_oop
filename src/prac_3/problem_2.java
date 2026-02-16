package prac_3;
import java.util.*;

class Person{
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Person[name=" + name + ", address=" + address + "]";
    }
}

class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString(){
        return "Student[Person[name=" + getName() + ", address=" + getAddress() +
                "], program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}

class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString(){
        return "Staff[Person[name=" + getName() + ", address=" + getAddress() +
                "], school=" + school + ", pay=" + pay + "]";
    }
}


public class problem_2 {
    private static HashSet<Person> persons = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Person Management System ===");
            System.out.println("1. Add a new Person");
            System.out.println("2. Add a new Student");
            System.out.println("3. Add a new Employee (Staff)");
            System.out.println("4. Print all persons");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    addStaff();
                    break;
                case 4:
                    printAllPersons();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addPerson() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        Person person = new Person(name, address);
        persons.add(person);
        System.out.println("Person added successfully!");
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter program: ");
        String program = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter fee: ");
        double fee = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student(name, address, program, year, fee);
        persons.add(student);
        System.out.println("Student added successfully!");
    }

    private static void addStaff() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter school: ");
        String school = scanner.nextLine();
        System.out.print("Enter pay: ");
        double pay = scanner.nextDouble();
        scanner.nextLine();

        Staff staff = new Staff(name, address, school, pay);
        persons.add(staff);
        System.out.println("Staff added successfully!");
    }

    private static void printAllPersons() {
        if (persons.isEmpty()) {
            System.out.println("No persons in the system.");
            return;
        }

        System.out.println("\n=== All Persons ===");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}

