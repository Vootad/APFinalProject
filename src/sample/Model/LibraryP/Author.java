package sample.Model.LibraryP;

import java.util.ArrayList;

public class Author {


    private String authorName;
    private String authorEducation;
    private static ArrayList<Book> authorsBookList;


    public Author(String authorName , String authorEducation , ArrayList<Book> authorsBookList){
        this.authorName = authorName;
        this.authorEducation = authorEducation;
        this.authorsBookList = authorsBookList;
    }

    public Author(){}


    public String getAuthorEducation() {return authorEducation;}
    public void setAuthorEducation(String authorEducation) {this.authorEducation = authorEducation;}

    public String getAuthorName() {return authorName;}
    public void setAuthorName(String authorName) {this.authorName = authorName;}

    public ArrayList<Book> getAuthorsBookList() {return authorsBookList;}
    public void setAuthorsBookList(ArrayList<Book> authorsBookList) {Author.authorsBookList = authorsBookList;}
}
