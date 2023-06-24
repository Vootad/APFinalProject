package sample.Model.LibraryP;

public class BuyRequest {
    private Book book = new Book();
    private LMember lMember = new LMember();
    private String buyCode;
    private Boolean buyCondition;

    public BuyRequest(Book book,LMember lMember,String buyCode,Boolean buyCondition) {
        this.book = book;
        this.lMember = lMember;
        this.buyCode = buyCode;
        this.buyCondition = buyCondition;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LMember getlMember() {
        return lMember;
    }

    public void setlMember(LMember lMember) {
        this.lMember = lMember;
    }

    public String getBuyCode() {
        return buyCode;
    }

    public void setBuyCode(String buyCode) {
        this.buyCode = buyCode;
    }

    public Boolean getBuyCondition() {
        return buyCondition;
    }

    public void setBuyCondition(Boolean buyCondition) {
        this.buyCondition = buyCondition;
    }
    public String getBookName(){
        return this.book.getBookName();
    }
    public String getBookSubject(){
        return this.book.getBookSubject();
    }
    public String getFirstName(){
        return this.lMember.getFirstName();
    }
}
