public class Book {
    private String BookName;
    private Author author;
    private int yearOfMade;

    public Book(String BookName, Author author, int yearOfMade) {
        if (author == null) {
            throw new IllegalArgumentException("Книга должна иметь автора.");
        }
        this.BookName = BookName;
        this.author = author;
        this.yearOfMade = yearOfMade;
    }

    public String getBookName() {
        return BookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }


    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }
}
