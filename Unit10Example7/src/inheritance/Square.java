package inheritance;

public class Square extends Rectangle{

    private static int squareCount;
    private int side;

    public Square() {
        squareCount++;
    }

    public Square(int side) {
        this.side = side;
        squareCount++;
    }

    public Square( int side,int x, int y ) {
        super( x, y);
        this.side = side;
        squareCount++;
    }
    public Square(Square side){
        this(side.getSide(),side.getX(),side.getY());
        squareCount++;

    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    //METHOD_OVERRIDE_FROM_RECTANGLE
    public void setWidth(int width){
        super.setWidth(width);
    }
    //METHOD_OVERRIDE_FROM_RECTANGLE
    public void setHeight(int height){
        super.setHeight(height);
    }

    public static int getCount() {
        return squareCount;
    }
}
