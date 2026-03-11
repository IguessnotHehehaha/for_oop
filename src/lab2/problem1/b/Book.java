package lab2.problem1.b;

public class Book extends LibraryItem {
    private int numberOfPages;
    private String genre;

    public Book(String title, String author, int publicationYear, int numberOfPages, String genre) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public int getNumberOfPages() { return numberOfPages; }
    public void setNumberOfPages(int numberOfPages) { this.numberOfPages = numberOfPages; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    @Override
    public String getItemType() { return "Book"; }

    public boolean isLongBook() {
        return numberOfPages > 500;
    }

    @Override
    public String toString() {
        return super.toString() + " | Pages: " + numberOfPages + " | Genre: " + genre;
    }
}
