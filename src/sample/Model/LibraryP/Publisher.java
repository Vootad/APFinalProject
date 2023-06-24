package sample.Model.LibraryP;

import sample.IF;

public class Publisher implements IF<Publisher> {
    private String publisherCode;
    private String publisherCountry;
    private String publisherName;

    public Publisher(String publisherName , String publisherCode , String publisherCountry) {
        this.publisherCode = publisherCode;
        this.publisherCountry = publisherCountry;
        this.publisherName = publisherName;
    }

    public Publisher(){}


    @Override
    public void objectToString(Publisher p){
        System.out.println("Publisher name is: " + p.getPublisherName());
        System.out.println("Publisher code is: " + p.getPublisherCode());
        System.out.println("Publisher country is: " + p.getPublisherCountry());
    }



    public String getPublisherName() {return publisherName;}
    public void setPublisherName(String publisherName) {this.publisherName = publisherName;}

    public String getPublisherCountry() {return publisherCountry;}
    public void setPublisherCountry(String publisherCountry) {this.publisherCountry = publisherCountry;}

    public String getPublisherCode() {return publisherCode;}
    public void setPublisherCode(String publisherCode) {this.publisherCode = publisherCode;}
}
