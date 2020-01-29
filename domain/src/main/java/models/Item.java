package models;

public class Item {
    private String header;
    private String description;
    private String currency;
    private String price;

    public Item(String header, String description, String currency, String price) {
        this.header = header;
        this.description = description;
        this.currency = currency;
        this.price = price;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
