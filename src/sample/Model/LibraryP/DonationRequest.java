package sample.Model.LibraryP;

public class DonationRequest {
    private Book book = new Book();
    private LMember member = new LMember();
    private String requestCode;

    public DonationRequest(Book book , LMember member , String requestCode){
        this.book = book;
        this.member = member;
        this.requestCode = requestCode;
    }


    public LMember getMember() {
        return member;
    }

    public void setMember(LMember member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    public String getRequestCode() {return requestCode;}
    public void setRequestCode(String requestCode) {this.requestCode = requestCode;}
}
