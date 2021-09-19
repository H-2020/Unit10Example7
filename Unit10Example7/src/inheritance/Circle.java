package inheritance;

public class Circle extends Shape{

    private static int count;
    private int radius;
    private int diameter;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(Circle circle){

    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    //METHOD_OVERRIDE_FROM_SHAPE
    public double getArea() {
        return (Math.PI*radius*radius);
    }

    //METHOD_OVERRIDE_FROM_SHAPE
    public double getPerimeter() {
        count++;
        return (2*Math.PI*radius);
    }

    public void grow(int diameter){
        this.diameter=diameter;
        this.radius=radius+diameter;
    }
    public  int getCount() {
        return count++;
    }

}
