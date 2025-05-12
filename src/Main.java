public class Main {
    public static void main(String[] args) {
        Author Author1 = new Author("Aleksandr", "Pushkin");
        Author Author2 = new Author("Lev", "Tolstoy");

        Book Book1 = new Book("Prorok", Author1, 1828);
        Book Book2 = new Book("War and Peace", Author2, 1867);

        System.out.println("Книга " + Book1.getBookName() + " написанная " + Book1.getAuthor() + " в " + Book1.getYearOfMade() + " году");
        System.out.println("Книга " + Book2.getBookName() + " написанная " + Book2.getAuthor() + " в " + Book2.getYearOfMade() + " году");

        System.out.println("Используем setter");
        Book1.setYearOfMade(2000);
        System.out.println("Книга " + Book1.getBookName() + " написанная " + Book1.getAuthor() + " в " + Book1.getYearOfMade() + " году");
    }
}
