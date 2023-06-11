package sample.Model.LibraryP;

public class Publisher {
    private String publisherCode;
    private String publisherCountry;
    private String publisherName;

    public Publisher(String publisherName , String publisherCode , String publisherCountry) {
        this.publisherCode = publisherCode;
        this.publisherCountry = publisherCountry;
        this.publisherName = publisherName;
    }

    public Publisher(){}


    public String getPublisherName() {return publisherName;}
    public void setPublisherName(String publisherName) {this.publisherName = publisherName;}

    public String getPublisherCountry() {return publisherCountry;}
    public void setPublisherCountry(String publisherCountry) {this.publisherCountry = publisherCountry;}

    public String getPublisherCode() {return publisherCode;}
    public void setPublisherCode(String publisherCode) {this.publisherCode = publisherCode;}
}
