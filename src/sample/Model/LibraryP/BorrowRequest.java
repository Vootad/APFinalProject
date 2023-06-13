package sample.Model.LibraryP;

public class BorrowRequest {
    private Book book = new Book();
    private LMember lMember = new LMember();
   private String borrowCode;
  private Boolean borrowCondition;

    public BorrowRequest(Book book,LMember lMember,String borrowCode,Boolean borrowCondition) {
        this.book = book;
        this.lMember = lMember;
        this.borrowCode = borrowCode;

        this.borrowCondition = borrowCondition;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public LMember getlMember() {
        return lMember;
    }

    public void setlMember(LMember lMember) {
        this.lMember = lMember;
    }

    public String getBorrowCode() {
        return borrowCode;
    }

    public void setBorrowCode(String borrowCode) {
        this.borrowCode = borrowCode;
    }

    public Boolean getBorrowCondition() {
        return borrowCondition;
    }

    public void setBorrowCondition(Boolean borrowCondition) {
        this.borrowCondition = borrowCondition;
    }
}
