import java.util.Objects;

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

    @Override
    public String toString() {
//        return BookName + " - эта книга была написана" + author + " в" + yearOfMade + " году";
        return author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfMade == book.yearOfMade && Objects.equals(BookName, book.BookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BookName, author, yearOfMade);
    }
}
