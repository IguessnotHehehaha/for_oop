package lab2.problem1.b;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 2008, 464, "Programming");
        Book book2 = new Book("War and Peace", "Leo Tolstoy", 1869, 1225, "Historical Fiction");

        System.out.println(book1);
        System.out.println("Is long book: " + book1.isLongBook());
        System.out.println();
        System.out.println(book2);
        System.out.println("Is long book: " + book2.isLongBook());
    }
}