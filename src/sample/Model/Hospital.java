package sample.Model;

public class Hospital extends Buildings{
    private String nOfDepartments;

    public Hospital(String name ,String nOfEmployees , String constructionCost , String area , String nOfDepartments ){
        super(name , nOfEmployees , constructionCost , area);
        this.nOfDepartments = nOfDepartments;
    }




    public String getnOfDepartments() {return nOfDepartments;}
    public void setnOfDepartments(String nOfDepartments) {this.nOfDepartments = nOfDepartments;}

}
