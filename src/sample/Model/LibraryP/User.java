package sample.Model.LibraryP;

public  class User {

    public String fName;
    public String lName;
    public String nationalCode;
    public String age;
    public String gender;
    public String phoneNumber;
    public String address;
    public User(String fName , String lName , String nationalCode , String age , String gender , String phoneNumber , String address){

        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
    }


}

