package ro.Fasttrackit.lab7;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    String getName() {
        return name;
    }
    double getPrice(){
        return price;
    }
    int getQuantity() {
        return quantity;
    }
    String getCategory(){
        return category;
    }
     int isQuantity(){
        return quantity;
    }

    boolean hasStock(){
        return quantity != 0;
    }
    boolean isCategory(String category) {
        return this.category.equals(category);
    }

}

