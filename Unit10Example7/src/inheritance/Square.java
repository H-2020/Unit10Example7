package inheritance;

public class Square extends Rectangle{

    private int count;
    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public Square( int side,int x, int y ) {
        super( x, y);
        this.side = side;
    }
    public Square(Square side){

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
    
    public  int getCount() {
        return count++;
    }
}
