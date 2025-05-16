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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(BookName);
    }
}
