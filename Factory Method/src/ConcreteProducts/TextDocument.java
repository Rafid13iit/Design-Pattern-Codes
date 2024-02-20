package ConcreteProducts;

import AbstractProduct.Document;

public class TextDocument extends Document {
    public void open() {
        System.out.println("Opening Text Document");
        // Add specific logic for opening a text document
    }

    public void save() {
        System.out.println("Saving Text Document");
        // Add specific logic for saving a text document
    }
}
