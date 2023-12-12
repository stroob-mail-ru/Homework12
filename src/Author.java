import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorLasttName;

    public Author(String authorFirstName, String authorLasttName) {
        this.authorFirstName = authorFirstName;
        this.authorLasttName = authorLasttName;
    }

    public Author(String authorLasttName) {
        authorFirstName = " ";
        this.authorLasttName = authorLasttName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLasttName() {
        return authorLasttName;
    }

    @Override
    public String toString() {
        if (authorFirstName == " ") {
            return authorLasttName;
        } else {
            return authorFirstName + " " + authorLasttName;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorLasttName, author.authorLasttName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLasttName);
    }
}
