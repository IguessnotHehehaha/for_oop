package lab_1.problem_5;
public class test {
    public static void main(String[] args) {

        System.out.println("Dragon doesn't eat");
        System.out.println("Line: BGBG");
        DragonLaunch dragon1 = new DragonLaunch();
        dragon1.kidnap(new Person("Alice", Gender.BOY, 20));
        dragon1.kidnap(new Person("Bob", Gender.GIRL, 21));
        dragon1.kidnap(new Person("Charlie", Gender.BOY, 22));
        dragon1.kidnap(new Person("Diana", Gender.GIRL, 23));

        dragon1.displayLine();
        dragon1.willDragonEatOrNot();

        System.out.println("Dragon eats");
        System.out.println("Line: GBGB");
        DragonLaunch dragon2 = new DragonLaunch();
        dragon2.kidnap(new Person("Emma", Gender.GIRL, 20));
        dragon2.kidnap(new Person("Frank", Gender.BOY, 21));
        dragon2.kidnap(new Person("Grace", Gender.GIRL, 22));
        dragon2.kidnap(new Person("Henry", Gender.BOY, 23));

        dragon2.displayLine();
        dragon2.willDragonEatOrNot();
    }
}
