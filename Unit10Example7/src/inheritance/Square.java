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
    public  int getCount() {
        return count++;
    }
}
