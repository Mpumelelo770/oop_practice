package za.co.wethinkcode.examples.toyrobot;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com");
        Book book1 = new Book("Harry Potter", author1);

        Author author2 = new Author("George Orwell", "gorwell@example.com");
        Book book2 = new Book("1984", author2);

        Library library = new Library("City Library");
        library.addBook(book1);
        library.addBook(book2);
        library.showLibraryBooks();
    }
    }

