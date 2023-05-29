package sample.Model;
public class Buildings {



    private String name;
    private String constructionCost;
    private String nOfEmployees;
    private String area;

    public Buildings(String name , String nOfEmployees , String constructionCost , String area){
        this.name = name;
        this.area = area;
        this.constructionCost = constructionCost;
        this.nOfEmployees = nOfEmployees;
    }



    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getArea() {return area;}
    public void setArea(String area) {this.area = area;}

    public String getNOfEmployees() {return nOfEmployees;}
    public void setNOfEmployees(String nOfEmployees) {this.nOfEmployees = nOfEmployees;}

    public String getConstructionCost() {return constructionCost;}
    public void setConstructionCost(String constructionCost) {this.constructionCost = constructionCost;}
}
