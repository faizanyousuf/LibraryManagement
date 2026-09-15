import model.Book;
import model.Transaction;
import model.Member;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import service.BookServices;

public class main {
    public static void main(String[] args){
        //  List<Book>  books = new  ArrayList<>();
        //  List<Member> members = new ArrayList<>();
        //  List<Transaction> transactions = new ArrayList<>();

         BookServices b = new BookServices();


        Book b1 = new Book(21,"ddfdfdfk","alchemis","brian","fiction",20,244);
        Book b2 =  new Book(32,"eiyouwe", "Java", "james gosling", "education", 3, 50);
        Book b3 = new Book(54, "eiyiouiou", "Linux", "Linus torvaldus", "education", 3, 54);

        Member m1 = new Member(101,"faizan","reshifaixxan980@gmail.com","8494023145","akhran mirbazar kulgam");
        Member m2 = new Member(102, "mahkana", "mirmehek10@gmail.com", "808322424", "katran");



        //  books.add(b1);
        //  books.add(b2);
        //  books.add(b3);
        //  books.remove(b3);
        //  members.add(m1);
        //  members.add(m2);

        //  for(Book b : books){
        //       System.out.println(b.toString());
        //  }
       
        //  for(Member m : members){
        //     System.out.println(m.toString());
        //  }
           
        //   int key = 54;
        //  for(Book b : books){
        //     if(b.getId() == key){
        //         System.out.println("true");
        //         break;
        //     }else{
        //         System.out.println("false");
        //     }
        //  }


        b.addBook(b1);
        b.addBook(b2);
        b.addBook(b3);
        b.displayBooks();

         b.removeBook(b2);
        b.displayBooks();
        System.out.println(b.searchBook(2));
    }
}
