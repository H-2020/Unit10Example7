package inheritance;

public abstract class Shape {

    private static int shapeCount;
    private int x;
    private int y;

    public Shape() {
        shapeCount++;
    }

    public Shape(int x, int y) {
        setPosition(x,y);
        shapeCount++;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x,int y){
        this.x=x;
        this.y=y;
    }
    public abstract double getArea();

    public abstract double getPerimeter();

    public static int getCount() {
        return shapeCount;
    }
}