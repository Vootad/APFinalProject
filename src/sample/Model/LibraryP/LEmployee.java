package sample.Model.LibraryP;

public class LEmployee extends User{
    private String LEmployeePassword;
    private String LEmployeeUserName;

        public LEmployee(String fName , String lName , String nationalCode , String age , String gender , String phoneNumber , String address , String username , String password){
            super(fName , lName , nationalCode , age , gender , phoneNumber , address);
            this.LEmployeeUserName = username;
            this.LEmployeePassword = password;
        }



    public String getLEmployeeUserName() {return LEmployeeUserName;}
    public void setLEmployeeUserName(String LEmployeeUserName) {this.LEmployeeUserName = LEmployeeUserName;}

    public String getLEmployeePassword() {return LEmployeePassword;}
    public void setLEmployeePassword(String LEmployeePassword) {this.LEmployeePassword = LEmployeePassword;}



}
