package shapes;

public class Font extends Shape {
    public String font;

    public Font() {
    }

    public Font(Font target) {
        super(target);
        if (target != null) {
            this.font = target.font;
        }
    }

    @Override
    public Shape clone() {
        return new Font(this);
    }

    /*
     * Font: This class represents a concrete prototype. It implements the cloning method.
     *
     * Font: এই ক্লাসটি একটি কনক্রিট প্রোটোটাইপ প্রতিনিধি দেখায়। এটি ক্লোনিং মেথড বাস্তবায়ন করে।
     */
}
