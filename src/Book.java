import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int publicationYear;

    public Book(String bookTitle, Author author, int publicationYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "\"" + getBookTitle() + "\", " + getAuthor().toString() + ", " + getPublicationYear() + "г.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, publicationYear);
    }
}
