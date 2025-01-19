package inheritance;

public class triangle extends Shape {
    private int c;

    public triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int perimeter() {
        return getA() + getB() + c;
    }
}
