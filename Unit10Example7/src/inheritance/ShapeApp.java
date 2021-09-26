package inheritance;

public class ShapeApp {

    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(25,50);
        Circle circle1=new Circle(10,10,20);
        Triangle triangle1=new Triangle(10,10,20);
        Square square1=new Square(5);
        IsoScelesTriangle isoScelesTriangle=new IsoScelesTriangle(20,20,10);

        System.out.println(rectangle1.getArea());
        System.out.println("Rectangle:"+Rectangle.getCount());
        System.out.println(circle1.getPerimeter());
        System.out.println("Circle:"+Circle.getCount());
        System.out.println(triangle1.getArea());
        System.out.println("triangle"+Triangle.getCount());
        System.out.println(square1.getPerimeter());
        System.out.println("square:" +Square.getCount());
        System.out.println(isoScelesTriangle.getArea());
        System.out.println("isoScelesTriangle"+IsoScelesTriangle.getCount());
        System.out.println("Sum of the shapes:"+Shape.getCount());
    }
}
