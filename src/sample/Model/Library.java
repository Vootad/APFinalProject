package sample.Model;

public class Library extends Buildings{

    String lManagerUsername;
    String lManagerPassword;
    String lManagerNationalCode;

    public Library(String name , String nOfEmployees, String constructionCost, String area , String lManagerUsername , String lManagerNationalCode , String lManagerPassword) {
        super(name , nOfEmployees, constructionCost, area);
        this.lManagerUsername = lManagerUsername;
        this.lManagerNationalCode = lManagerNationalCode;
        this.lManagerPassword = lManagerPassword;
    }

    public String getlManagerUsername() {return lManagerUsername;}
//    public void setlManagerUsername(String lManagerUsername) {this.lManagerUsername = lManagerUsername;}

    public String getlManagerPassword() {return lManagerPassword;}
//    public void setlManagerPassword(String lManagerPassword) {this.lManagerPassword = lManagerPassword;}

    public String getlManagerNationalCode() {return lManagerNationalCode;}
//    public void setlManagerNationalCode(String lManagerNationalCode) {this.lManagerNationalCode = lManagerNationalCode;}
}
