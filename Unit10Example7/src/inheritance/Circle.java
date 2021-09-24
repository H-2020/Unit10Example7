package inheritance;

public class Circle extends Shape{
    
    public static final int ANGLES=0;
    private static int circleCounter;
    private int radius;
    private int diameter;

    public Circle() {
        circleCounter++;
    }

    public Circle(int radius) {
        this.radius = radius;
         circleCounter++;
    }

    public Circle(int x, int y, int radius) {
        super.setPosition(x,y);
        this.radius = radius;
         circleCounter++;
    }

    public Circle(Circle circle){
        this(circle.getRadius

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
