public class Author {
    private String authorFirstName;
    private String authorLasttName;
    private String author;

    public Author(String authorFirstName, String authorLasttName) {
        this.authorFirstName = authorFirstName;
        this.authorLasttName = authorLasttName;
        this.author = authorFirstName + " " + authorLasttName;
    }

    public Author(String authorLasttName) {
        this.authorFirstName = " ";
        this.authorLasttName = authorLasttName;
        this.author = authorLasttName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorLasttName() {
        return this.authorLasttName;
    }

    public String getAuthor() {
        return this.author;
    }
}
