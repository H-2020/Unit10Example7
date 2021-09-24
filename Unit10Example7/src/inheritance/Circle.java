package inheritance;

public class Circle extends Shape {

    public static final int ANGLES = 0;
    private static int circleCounter;
    private int radius;


    public Circle() {
        circleCounter++;

    }

    public Circle(int radius) {
        this.radius = radius;
        circleCounter++;
    }

    public Circle(int x, int y, int radius) {
        super.setPosition(x, y);
        this.radius = radius;
        circleCounter++;
    }

    public Circle(Circle circle) {
        this(circle.getRadius(), circle.getX(), circle.getY());
        circleCounter++;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    //METHOD_OVERRIDE_FROM_SHAPE
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    //METHOD_OVERRIDE_FROM_SHAPE
    public double getPerimeter() {

        return (2 * Math.PI * radius);
    }

    public void grow(int diameter) {
        this.radius = this.radius + Math.abs(diameter);
    }

    public static int getCount() {
        return circleCounter;
    }

    //METHOD_OVERRIDE_FROM OBJECT
    public String toString() {
        return "Circle radius: " + radius +"x: "+super.getX()+"y: "+super.getY();
    }
}
