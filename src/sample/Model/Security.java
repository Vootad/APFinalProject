package sample.Model;

public class Security extends Person{

    private int overTimeDayShift;
    private int overTimeNightShift;

    public Security(String fName , String lName , String personnelId , int employmentYear , long salaryBase , int overTimeDayShift , int overTimeNightShift){
        super( fName , lName , personnelId , employmentYear , salaryBase);
        this.overTimeDayShift = overTimeDayShift;
        this.overTimeNightShift = overTimeNightShift;
    }
//every single year  +0.03
// every day shift   +0.02
// every night shift +0.01

    public double salary(Security s){
        double salary_ = 0;
        int experience = 2023 - s.getEmploymentYear();
        for(int i=0; i<experience; i++){
            salary_ += s.getSalaryBase() * 0.03;
        }
        salary_ += (s.getOverTimeDayShift() * 0.01 * s.getSalaryBase()) + (s.getOverTimeNightShift() * 0.02 * s.getSalaryBase());//over time shifts
        return salary_;
    }
    public int getOverTimeDayShift() {return overTimeDayShift;}
    public void setOverTimeDayShift(int overTimeDayShift) {
        this.overTimeDayShift = overTimeDayShift;
    }

    public int getOverTimeNightShift() {
        return overTimeNightShift;
    }
    public void setOverTimeNightShift(int overTimeNightShift) {
        this.overTimeNightShift = overTimeNightShift;
    }



}
