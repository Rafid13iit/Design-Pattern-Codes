// components/OrderComponent.java
package components;

public interface OrderComponent {
    double getPrice();
}


//Defines a common interface for both leaf components (products) and 
//composite components (boxes). It declares a method getPrice() that is 
//implemented by both products and boxes.
