package sample.Model.LibraryP;

import sample.IF;

public class LEmployee extends User implements IF<LEmployee> {
    private String LEmployeePassword;
    private String LEmployeeUserName;

        public LEmployee(String fName , String lName , String nationalCode , String age , String gender , String phoneNumber , String address , String username , String password){
            super(fName , lName , nationalCode , age , gender , phoneNumber , address);
            this.LEmployeeUserName = username;
            this.LEmployeePassword = password;
        }


    @Override
    public void objectToString(LEmployee lE){
        System.out.println("Employee first name is: " + lE.getFirstName());
        System.out.println("Employee last name is: " + lE.getLastName());
        System.out.println("Employee gender is: " + lE.getGender());
        System.out.println("Employee national code is: " + lE.getNationalCode());
        System.out.println("Employee phone number is: " + lE.getPhoneNumber());
    }


    public String getLEmployeeUserName() {return LEmployeeUserName;}
    public void setLEmployeeUserName(String LEmployeeUserName) {this.LEmployeeUserName = LEmployeeUserName;}

    public String getLEmployeePassword() {return LEmployeePassword;}
    public void setLEmployeePassword(String LEmployeePassword) {this.LEmployeePassword = LEmployeePassword;}



}
