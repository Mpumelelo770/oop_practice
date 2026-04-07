package za.co.wethinkcode.examples.toyrobot;

import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> bookList;

    //constructor
    public Library(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }

    //adding book
    public void addBook(Book book) {
        bookList.add(book);
    }

    //getter
    public String getName() {
        return this.name;
    }


    public void showLibraryBooks() {
        for (Book item: bookList) {
            System.out.println("Library: " + this.getName() + "\n" +
                    "Book: " + item.getTitle() + "\n" +
                    item.getAuthor());
            System.out.println("\n");
        }
    }
}
