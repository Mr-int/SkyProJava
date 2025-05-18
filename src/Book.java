public class Book {
    private String BookName;
    private Author author;
    private int yearOfMade;

    public Book(String BookName, Author author, int yearOfMade) {
        if (author == null) {
            throw new IllegalArgumentException("Книга не может быть без автора");
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
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return yearOfMade == book.yearOfMade && BookName.equals(book.BookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(BookName);
    }
}
