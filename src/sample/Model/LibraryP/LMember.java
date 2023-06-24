package sample.Model.LibraryP;

import sample.IF;

import java.util.ArrayList;
public class LMember extends User implements IF<LMember>  {
    private String userName; //unique
    private String password;  //unique
    private String memberShipCode; //unique
    private ArrayList<Book> memberBorrowedBooksList = new ArrayList<>();
    private ArrayList<Book> memberBoughtBooksList = new ArrayList<>();


    public LMember(String fName , String lName , String nationalCode , String age , String gender , String phoneNumber , String address , String username , String password , String memberShipCode , ArrayList<Book>Borrowed , ArrayList<Book>Bought){
        super(fName , lName , nationalCode , age , gender , phoneNumber , address);
        this.userName = username;
        this.password = password;
        this.memberShipCode = memberShipCode;
        this.memberBorrowedBooksList = Borrowed;
        this.memberBoughtBooksList = Bought;
    }

    public LMember(){}


    @Override
    public void objectToString(LMember lM){
        System.out.println("Member first name is: " + lM.getFirstName());
        System.out.println("Member last name is: " + lM.getLastName());
        System.out.println("Member gender is: " + lM.getGender());
        System.out.println("Member membership code is: " + lM.getMemberShipCode());
    }




    public ArrayList<Book> getMemberBoughtBooksList() {
        return memberBoughtBooksList;
    }

    public void setMemberBoughtBooksList(ArrayList<Book> memberBoughtBooksList) {
        this.memberBoughtBooksList = memberBoughtBooksList;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberShipCode() {
        return memberShipCode;
    }
    public void setMemberShipCode(String memberShipCode) {
        this.memberShipCode = memberShipCode;
    }

    public ArrayList<Book> getMemberBorrowedBooksList() {
        return this.memberBorrowedBooksList;
    }
    public void setMemberBorrowedBooksList(ArrayList<Book> memberBorrowedBooksList) {
        this.memberBorrowedBooksList = memberBorrowedBooksList;
    }
}
