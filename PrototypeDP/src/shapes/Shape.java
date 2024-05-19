package shapes;

public abstract class Shape implements Cloneable {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();
}

/*
 * Shape: This abstract class serves as the prototype interface. It declares the cloning method.
 *
 * Shape: এই এবস্ট্রাক্ট ক্লাসটি প্রোটোটাইপ ইন্টারফেস হিসাবে কাজ করে। এটি ক্লোনিং মেথড ঘোষণা করে।
 */
