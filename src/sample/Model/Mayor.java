package sample.Model;

public class Mayor extends Person {//implements MyInterface{



    public String password;
    public Mayor(String fName , String lName , String personnelId , int employmentYear , long salaryBase , String password){
        super(fName , lName , personnelId , employmentYear , salaryBase);
        this.password = password;
    }


    public double salary(Mayor m){
        double salary_ = 0;
        int experience = 2023 - m.getEmploymentYear();
        for(int i=0; i<experience; i++){
            salary_ += m.getSalaryBase() * 0.05;
        }
        return salary_;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}
