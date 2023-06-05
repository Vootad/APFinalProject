package sample.Model.LibraryP;

public  class User {


    private String lastName;
    private String firstName;
    private String nationalCode;
    private String age;
    public String gender;
    public String phoneNumber;
    public String address;
    public User(String firstName , String lastName , String nationalCode , String age , String gender , String phoneNumber , String address){

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lName) {
        this.lastName = lName;
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

