package sample.Model.LibraryP;

public class LEmployee {
    private String LEmployeePassword;
    private String LEmployeeUserName;

    public LEmployee(String username , String password){
        this.LEmployeeUserName = username;
        this.LEmployeePassword = password;
    }



    public String getLEmployeeUserName() {return LEmployeeUserName;}
    public void setLEmployeeUserName(String LEmployeeUserName) {this.LEmployeeUserName = LEmployeeUserName;}

    public String getLEmployeePassword() {return LEmployeePassword;}
    public void setLEmployeePassword(String LEmployeePassword) {this.LEmployeePassword = LEmployeePassword;}



}
