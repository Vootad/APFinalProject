package sample.Model;

public class Person {
    private String fName;
    private String lName;
    private String personnelId;
    private int employmentYear;
    private long salaryBase;

    public Person(String fName , String lName , String personnelId , int employmentYear , long salaryBase){ //constructor
        this.fName = fName;
        this.lName = lName;
        this.personnelId = personnelId;
        this.employmentYear = employmentYear;
        this.salaryBase = salaryBase;
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

    public String getPersonnelId() {
        return personnelId;
    }
    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }
    public void setEmploymentYear(int employmentYear) {
        this.employmentYear = employmentYear;
    }

    public long getSalaryBase() {
        return salaryBase;
    }
    public void setSalaryBase(long salaryBase) {
        this.salaryBase = salaryBase;
    }
}
