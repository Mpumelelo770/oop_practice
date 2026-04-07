package za.co.wethinkcode.examples.toyrobot;

public class Book {
    private String title;
    private Author author;

    //constructor
    public Book(String title, Author author) {
        validateTitle(title);
        this.title = title;
        this.author = author;
    }


    //getters
    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    //setters
    public void setTitle(String newTitle) {
        validateTitle(newTitle);
        this.title = newTitle;
    }

    public void setAuthor(Author newAuthor) {
        this.author = newAuthor;
    }

    //validations
    private void validateTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
    }

    //printing book details
    public void showBookDetails() {
        System.out.println("title: " + this.title + "\n" + "Author name: " + this.author.getName()
        + "\n" + "Author email: " + this.author.getEmail());
    }
}
