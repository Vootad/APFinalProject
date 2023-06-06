package sample.Model.LibraryP;

import java.util.ArrayList;

public class MemberRequest extends User {
    private String userName; //unique
    private String password;  //unique
//    private String memberShipCode; //unique
//    private ArrayList<Book> memberBorrowedBooksList = new ArrayList<>();


    public MemberRequest(String fName , String lName , String nationalCode , String age , String gender , String phoneNumber , String address , String username , String password ){
        super(fName , lName , nationalCode , age , gender , phoneNumber , address);
        this.userName = username;
        this.password = password;
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



//    public ArrayList<Book> getMemberBorrowedBooksList() {
//        return memberBorrowedBooksList;
//    }
//    public void setMemberBorrowedBooksList(ArrayList<Book> memberBorrowedBooksList) {
//        this.memberBorrowedBooksList = memberBorrowedBooksList;
//    }
}
