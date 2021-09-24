package inheritance;

public class Rectangle extends Shape {


    private static int rectangleCount;
    public static final int ANGLES = 4;
    private int width;
    private int height;

    public Rectangle() {
        rectangleCount++;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        rectangleCount++;
    }

    public Rectangle(int width, int height, int x, int y) {
        super(x, y);
        this.width = width;
        this.height = height;
        rectangleCount++;

    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getX(), rectangle.getY(), rectangle.getHeight(), rectangle.getWidth());
        rectangleCount++;

    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //METHOD_OVERRIDE_FROM_SHAPE
    public double getArea() {
        return (this.width * this.height);

    }

    //METHOD_OVERRIDE_FROM_SHAPE
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public void grow(int d) {
        this.height = this.height + Math.abs(d);
        this.width = this.width + Math.abs(d);
    }

    public static int getCount() {
        return rectangleCount;
    }


}
