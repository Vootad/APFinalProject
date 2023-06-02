package sample.Model.LibraryP;

public class Book {
    private String bookName;
    private String bookId;  //unique
    private String bookSubject;
    private String bookPrice;
    private Boolean bookCondition; //1:available  0:unavailable


    public Book(String bookName , String bookId , String bookSubject , String bookPrice , Boolean bookCondition){
        this.bookName = bookName;
        this.bookId = bookId;
        this.bookSubject = bookSubject;
        this.bookPrice = bookPrice;
        this.bookCondition = bookCondition;
    }


    public String getBookName() {return bookName;}
    public void setBookName(String bookName) {this.bookName = bookName;}

    public String getBookId() {return bookId;}
    public void setBookId(String bookId) {this.bookId = bookId;}

    public String getBookSubject() {return bookSubject;}
    public void setBookSubject(String bookSubject) {this.bookSubject = bookSubject;}

    public String getBookPrice() {return bookPrice;}
    public void setBookPrice(String bookPrice) {this.bookPrice = bookPrice;}

    public Boolean getBookCondition() {return bookCondition;}
    public void setBookCondition(Boolean bookCondition) {this.bookCondition = bookCondition;}






}
