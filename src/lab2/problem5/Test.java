package lab2.problem5;

public class Test {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineering");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Person bob = new Student("Bob", 22, "Biology");

        Animal kot = new Cat("kot", 5);
        Animal rex = new Dog("Rex", 3);
        Animal farfetched = new Bird("farfetched", 2);
        Animal nemo = new Fish("Nemo", 1);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println(" Assigning pets ");
        john.assignPet(rex);
        bob.assignPet(farfetched);

        System.out.println("\n Trying to give a dog to PhD student directly ");
        alice.assignPet(new Dog("Buddy", 2));

        System.out.println("\n Giving valid pets to PhD student ");
        alice.assignPet(kot);

        System.out.println("\nInitial state:");
        System.out.print(registry);

        System.out.println(" John goes on vacation, leaves Rex with Alice (should fail she has a pet) ");
        john.leavePetWith(alice);

        System.out.println("\n Alice temporarily gives kot to Bob (already has farfetched, should fail) ");
        alice.leavePetWith(bob);

        System.out.println("\n Bob gives farfetched to Alice ");
        bob.leavePetWith(alice);

        System.out.println("\nAfter Bob leaves farfetched with Alice:");
        System.out.print(registry);

        System.out.println(" Now John tries to leave Rex with Alice (who has kot, should fail) ");
        john.leavePetWith(alice);

        System.out.println("\n John leaves Rex with Bob (who has no pet) ");
        john.leavePetWith(bob);

        System.out.println("\nAfter John leaves Rex with Bob:");
        System.out.print(registry);

        System.out.println(" John returns from vacation and retrieves Rex from Bob ");
        john.retrievePetFrom(bob);

        System.out.println("\nAfter John retrieves Rex:");
        System.out.print(registry);

        System.out.println(" People with pets ");
        for (Person p : registry.findPeopleWithPets()) {
            System.out.println("  " + p.getName() + " -> " + p.getPet().getName());
        }

        System.out.println("\n People without pets ");
        for (Person p : registry.findPeopleWithoutPets()) {
            System.out.println("  " + p.getName());
        }

        System.out.println("\n PhD student trying to receive a dog via leavePetWith ");
        Person carol = new Employee("Carol", 35, "HR");
        carol.assignPet(new Dog("Max", 4));
        registry.addPerson(carol);
        carol.leavePetWith(alice);

        System.out.println("\n Animal sounds ");
        Animal[] animals = {kot, rex, farfetched, nemo};
        for (Animal a : animals) {
            System.out.println(a.getName() + " says: " + a.getSound());
        }
    }
}
