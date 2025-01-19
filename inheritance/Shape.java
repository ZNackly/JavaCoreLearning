package inheritance;
public abstract class Shape {
    private int a;
    private int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int perimeter(int a, int b) {
        return 0;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}