package service;

import java.util.ArrayList;
import java.util.List;
import model.Transaction;
import model.Book;
import java.time.LocalDate;
import model.Member;
import model.TransactionStatus;
import service.BookServices;
import service.MemberServices;

public class LibraryServices {

    private BookServices bookServices;
    private MemberServices memberServices;
    List<Transaction> transactions = new ArrayList<>();

    public LibraryServices() {
        this.bookServices = new BookServices();
        this.memberServices = new MemberServices();

    }

    public boolean issueBook(int memberId, int bookId) {
        boolean isBook = false;
        boolean isMember = false;
        boolean isAvailable = false;
        for (Book b : bookServices.getAllBooks()) {
            if (b.getId() == bookId) {
                isBook = true;
                break;
            }
        }

        for (Member m : memberServices.getAllMembers()) {
            if (m.getMemberId() == memberId) {
                isMember = true;
                break;
            }
        }

        if (bookServices.searchBook(bookId).getAvailableCopies() > 0) {
            isAvailable = true;
        }
         
        LocalDate issueDate = LocalDate.now();
        LocalDate dueDate = issueDate.plusDays(14);
        int transactionId = transactions.size()+1;
        if(isBook && isMember && isAvailable){
            transactions.add(new Transaction(transactionId, bookId, memberId,issueDate,dueDate, null, bookId,TransactionStatus.ISSUED));
        }

    }

}
