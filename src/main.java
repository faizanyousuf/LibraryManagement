import model.Book;
import model.Transaction;
import java.time.LocalDate;
public class main {
    public static void main(String[] args){

        // Book b = new Book(21,"ddfdfdfk","alchemis","brian","fiction",20,244);

        // b.setId(45);
        // b.getId();
        // System.out.println(b);
         
        Transaction t = new Transaction(101,33,3522,LocalDate.of(2026,9,13),LocalDate.of(2026,10,13),null,0,"Issued");

        System.out.println(t);
    }
}
