package inheritance;

public class Triangle extends Shape{

    private int count;
    private int height;
    private int width;
    private int perpendicular;

    public Triangle() {
    }

    public Triangle(int height, int width, int perpendicular) {
        this.height = height;
        this.width = width;
        this.perpendicular = perpendicular;
    }

    public Triangle(int height, int width, int perpendicular, int x, int y ) {
        super(x, y);
        this.height = height;
        this.width = width;
        this.perpendicular = perpendicular;
    }
    public Triangle(Triangle triangle){

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
    public  int getCount() {
        return count++;
    }
}
