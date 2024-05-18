// components/Box.java
package components;

import java.util.ArrayList;
import java.util.List;

public class Box implements OrderComponent {
    private List<OrderComponent> items = new ArrayList<>();

    public void add(OrderComponent item) {
        items.add(item);
    }

    public void remove(OrderComponent item) {
        items.remove(item);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (OrderComponent item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}

//Represents a composite component that implements the OrderComponent interface. 
//It contains a list of OrderComponent objects, which can be either products or nested boxes. 
//The getPrice() method of the Box class recursively calculates the total price by traversing through its items, 
//whether they are products or nested boxes.
