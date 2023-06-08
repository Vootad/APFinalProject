package sample.Model.LibraryP;

public class BookDonate {
    private String bookName;
    private String bookId;  //unique
    private String bookSubject;
    private double bookPrice;
    private Boolean bookCondition;
    public BookDonate(String bookName,String bookId,String bookSubject,double bookPrice,Boolean bookCondition){
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

    public double getBookPrice() {return bookPrice;}
    public void setBookPrice(double bookPrice) {this.bookPrice = bookPrice;}
    public Boolean getBookCondition(){
        return bookCondition;
    }
    public void setBookCondition(Boolean bookCondition){
        this.bookCondition = bookCondition;
    }
}
