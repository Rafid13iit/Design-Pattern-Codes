// products/Product.java
package products;

import components.OrderComponent;

public class Product implements OrderComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

//Represents a leaf component that implements the OrderComponent interface. 
//It provides a getPrice() method to return the price of the product.