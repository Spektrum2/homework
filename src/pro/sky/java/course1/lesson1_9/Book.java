package pro.sky.java.course1.lesson1_9;

public class Book {
    private String name;
    private Author author;
    private int yearPublishing;

    public Book(String name, Author author, int yearPublishing) {
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public String getAuthorName(Book book) {
        return book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName();
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing() {
        this.yearPublishing = yearPublishing;
    }
}
