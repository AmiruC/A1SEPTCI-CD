package com.example.s389859official.model;

public class Item {

    public Item() {

    }

    private String id;
    private String name;
    private String desc;

    private String imgURL;
    private double price;

    public Item(String id, String name, String desc,String imgURL, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.imgURL = imgURL;
    }


    public String getId() {
        return id;
    }
    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {this.imgURL = imgURL;}

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", image='" + imgURL + '\'' +
                ", price=" + price +
                '}';
    }

}