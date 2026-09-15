package model;
import java.time.LocalDate;
public class Transaction {
    
    private int transactionId;
    private int bookId;
    private int memberId;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private double fine;
    // private String status;
    private TransactionStatus status;


       public Transaction(int transactionId, int bookId, int memberId, LocalDate issueDate, LocalDate dueDate,LocalDate returnDate, double fine, TransactionStatus status) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.fine = fine;
        this.status = status;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }


    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", bookId=" + bookId + ", memberId=" + memberId
                + ", issueDate=" + issueDate + ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", fine=" + fine
                + ", status=" + status + "]";
    }

    
}
