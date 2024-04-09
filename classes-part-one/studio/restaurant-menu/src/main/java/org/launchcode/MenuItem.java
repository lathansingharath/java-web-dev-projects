package org.launchcode;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private Boolean isNew;
    private String category;


    public MenuItem(String name, double price, String description, Boolean isNew, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.isNew = isNew;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

