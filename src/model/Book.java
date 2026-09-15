package model;
public class Book{
    private int id;
    private String ISBN;
    private String title;
    private String author;
    private String category;
    private int totalCopies;
    private int availableCopies;

    public Book(int id,String ISBN, String title, String author, String category,int totalCopies, int availableCopies){
        this.id = id;
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.category = category;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }


     public boolean equals(Book that){
              if(that == null){
                return false;
              }else if (this.id == that.id){
                    return true;
              }else {
                return false;
              }
     }
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Book [id=" + id + ", ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", category="
                + category + ", totalCopies=" + totalCopies + ", availableCopies=" + availableCopies + "]";
    }

}