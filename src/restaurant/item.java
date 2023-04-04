package restaurant;

import java.util.ArrayList;

public class item {
    private String name;
    private String description;
    private String category;
    private Double price;
    private String isNew;

    public item (String n, String d, String c, Double p, String iN) {
    this.name= n;
    this.description= d;
    this.category= c;
    this.price= p;
    this.isNew= iN;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }
}
