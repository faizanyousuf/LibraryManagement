package service;

import java.util.ArrayList;
import model.Book;
import java.util.List;

public class BookServices {

    private ArrayList<Book> books;

    public BookServices() {
        books = new ArrayList<>();
    }

    // Returnig full list of available books
    public ArrayList<Book> getAllBooks() {
        return books;
    }

    // Adding a new Book
    public void addBook(Book book) {
        books.add(book);
    }

    // Removing a book if present
    public void removeBook(Book book) {

        for (Book b : books) {
            if (b.equals(book)) {
                books.remove(book);
                System.out.println("Book Removed Successfully!");
            }
        }
        System.out.println("Book Not Found!");
    }

    // Search for a book by Id
    public Book searchBook(int id) {

        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    // Search For a Book by Title
    public List<Book> searchBook(String title) {
        List<Book> result = new ArrayList<>();
        if (title == null) {
            return result;
        } else {
            for (Book b : books) {
                if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    result.add(b);
                }
            }
        }
        return result;
    }

    // Updating an Existing Book
    public boolean updateBook(Book book) {

        Book existingBook = searchBook(book.getId());

        if (existingBook == null) {
            return false;
        } else {
            existingBook.setTitle(book.getTitle());
            existingBook.setISBN(book.getISBN());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setCategory(book.getCategory());
            existingBook.setTotalCopies(book.getTotalCopies());
            existingBook.setAvailableCopies(book.getAvailableCopies());
            return true;
        }
    }

    // Displaying all Books

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }

}
