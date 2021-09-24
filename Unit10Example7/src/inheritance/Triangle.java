package inheritance;

public class Triangle extends Shape{

    public static final int ANGLES=3;
    private static int triangleCount;
    private int height;
    private int width;
    private int perpendicular;

    public Triangle() {
        triangleCount++;
    }

    public Triangle(int height, int width, int perpendicular) {
        this.height = height;
        this.width = width;
        this.perpendicular = perpendicular;
        triangleCount++;
    }

    public Triangle(int height, int width, int perpendicular, int x, int y ) {
        super.setPosition(x,y);
        this.height = height;
        this.width = width;
        this.perpendicular = perpendicular;
        triangleCount++;
    }
    public Triangle(Triangle triangle){
        this(triangle.getX(), triangle.getY(), triangle.width, triangle.getHeight(), triangle.getPerpendicular());
        triangleCount++;

    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerpendicular() {
        return this.perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    //METHOD_OVERRIDE_FROM_SHAPE
    public double getArea() {
        return (perpendicular*height)/2;
    }

    //METHOD_OVERRIDE_FROM_SHAPE
    public double getPerimeter() {
        return (this.height+this.width+this.perpendicular);
    }
    public static int getCount() {
        return triangleCount;
    }
}