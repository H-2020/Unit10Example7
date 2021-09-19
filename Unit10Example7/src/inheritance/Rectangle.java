package inheritance;

public class Rectangle extends Shape{

    private static int count;
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height,int x, int y ) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    public Rectangle(Rectangle rectangle){

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
        count++;
        return (this.width*this.height);

    }

    //METHOD_OVERRIDE_FROM_SHAPE
    public double getPerimeter() {
        return 2*(this.width+this.height);
    }
    public int getCount() {
        return count++;
    }


}
