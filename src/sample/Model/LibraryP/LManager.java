package sample.Model.LibraryP;

public class LManager extends User{
    private String password;
    private String userName;

    public LManager(String fName , String lName , String nationalCode , String age , String gender , String phoneNumber , String address , String username , String password){
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

}
