package sample.Model;

public class University extends Buildings{
    private String nOfMajors;
    private String nOfProfessors;

    public University(String name ,String nOfEmployees, String constructionCost, String area, String nOfMajors , String nOfProfessors) {
        super(name , nOfEmployees, constructionCost, area);
        this.nOfMajors = nOfMajors;
        this.nOfProfessors = nOfProfessors;
    }


    public String getnOfProfessors() {return nOfProfessors;}
    public void setnOfProfessors(String nOfProfessors) {this.nOfProfessors = nOfProfessors;}

    public String getnOfMajors() {return nOfMajors;}
    public void setnOfMajors(String nOfMajors) {this.nOfMajors = nOfMajors;}
}
