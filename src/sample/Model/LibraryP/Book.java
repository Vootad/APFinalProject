package sample.Model.LibraryP;

import sample.IF;

public class Book implements IF<Book> {
    private String bookName;
    private String bookId;  //unique
    private String bookSubject;
    private double bookPrice;
    private Boolean bookCondition; //1:available  0:unavailable
    private Publisher publisher = new Publisher();
    private Author author = new Author();


    @Override
    public void objectToString(Book book){
        String id = book.getBookId();
        String name = book.getBookName();
        String subject = book.getBookSubject();
        Double price = book.getBookPrice();
        System.out.println("Book id is: " + id);
        System.out.println("Book name is: " + name);
        System.out.println("Book subject is: " + subject);
        System.out.println("Book price is: " + price);
    }



    public Book(String bookName , String bookId , String bookSubject , double bookPrice , Boolean bookCondition , Publisher publisher , Author author){
        this.bookName = bookName;
        this.bookId = bookId;
        this.bookSubject = bookSubject;
        this.bookPrice = bookPrice;
        this.bookCondition = bookCondition;
        this.publisher = publisher;
        this.author = author;
    }

    public Book(){}

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


    public Publisher getPublisher() {return publisher;}
    public void setPublisher(Publisher publisher) {this.publisher = publisher;}

    public Author getAuthor() {return author;}
    public void setAuthor(Author author) {this.author = author;}

}
