package client;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;
import shapes.Font; // Import Font class

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        Square square = new Square();
        square.sideLength = 10;
        square.color = "green";
        shapes.add(square);

        Triangle triangle = new Triangle();
        triangle.base = 10;
        triangle.height = 15;
        triangle.color = "yellow";
        shapes.add(triangle);
        
        Font fontObject = new Font(); // Create Font object
        fontObject.font = "Arial new"; // Set font
        shapes.add(fontObject);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}

/*
 * Client: This class demonstrates the Prototype pattern. It creates and compares clones of various shapes.
 *
 * Client: এই ক্লাসটি প্রোটোটাইপ প্যাটার্ন উদাহরণ দেখায়। এটি বিভিন্ন আকারের ক্লোন তৈরি এবং তাদের তুলনা করে।
 */
