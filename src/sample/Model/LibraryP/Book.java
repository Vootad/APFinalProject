package sample.Model.LibraryP;

public class Book extends Publisher{
    private String bookName;
    private String bookId;  //unique
    private String bookSubject;
    private double bookPrice;
    private Boolean bookCondition; //1:available  0:unavailable
    Publisher publisher = new Publisher();




    public Book(String bookName , String bookId , String bookSubject , double bookPrice , Boolean bookCondition , Publisher publisher){
        this.bookName = bookName;
        this.bookId = bookId;
        this.bookSubject = bookSubject;
        this.bookPrice = bookPrice;
        this.bookCondition = bookCondition;
        this.publisher = publisher;
    }

// نام مدرک کتل منتشر شده
    public String getBookName() {return bookName;}
    public void setBookName(String bookName) {this.bookName = bookName;}

    public String getBookId() {return bookId;}
    public void setBookId(String bookId) {this.bookId = bookId;}

    public String getBookSubject() {return bookSubject;}
    public void setBookSubject(String bookSubject) {this.bookSubject = bookSubject;}

    public double getBookPrice() {return bookPrice;}
    public void setBookPrice(double bookPrice) {this.bookPrice = bookPrice;}

    public Boolean getBookCondition() {return bookCondition;}
    public void setBookCondition(Boolean bookCondition) {this.bookCondition = bookCondition;}




    public String getPublisherCode() {return publisher.getPublisherCode();}
    public void setPublisherCode(String publisherCode) {this.publisher.setPublisherCode(publisherCode);}

    public String getPublisherCountry() {return publisher.getPublisherCountry();}
    public void setPublisherCountry(String publisherCountry) {this.publisher.setPublisherCountry(publisherCountry);}

    public String getPublisherName() {return publisher.getPublisherName();}
    public void setPublisherName(String publisherName) {this.publisher.setPublisherName(publisherName);}


}
