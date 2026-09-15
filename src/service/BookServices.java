package service;
import model.Book;
import java.util.ArrayList;

public class BookServices {

     private ArrayList<Book> books;

    public BookServices (){
            books = new ArrayList<>();
    }

    public ArrayList<Book> 

   public void addBook(Book book){
          books.add(book);
    }

   public void removeBook(Book book){

        for(Book b : books){
            if (b.equals(book)){
                books.remove(book);
                System.out.println("Book Removed Successfully!");
            }
        }
        System.out.println("Book Not Found!");
    }

    public boolean searchBook(int id){
            
        for(Book b : books){
            if(b.getId() == id){
                return true;
            }
        }
        return false;
    }
    public boolean searchBook(String title){

        return true;
    }

    public void updateBook(Book book){

    }

    public void displayBooks(){
             
        for(Book b : books){
            System.out.println(b.toString());
        }
    }

}
