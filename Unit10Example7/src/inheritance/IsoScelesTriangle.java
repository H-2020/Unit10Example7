package inheritance;

public class IsoScelesTriangle extends Triangle{

    private int count;

    public IsoScelesTriangle() {
    }

    public IsoScelesTriangle(int height, int width, int perpendicular) {
        super(height, width, perpendicular);
    }

    public IsoScelesTriangle(int height, int width, int perpendicular, int x, int y) {
        super(height, width, perpendicular, x, y);
    }

    public IsoScelesTriangle(Triangle triangle) {
        super(triangle);
    }
    public  int getCount() {
        return count++;
    }
}
