package sample.Model.LibraryP;

public  class User {


    private String lName;
    private String fName;
    private String nationalCode;
    private String age;
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

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }


    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }


    public String getNationalCode() {
        return nationalCode;
    }
    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }


    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

