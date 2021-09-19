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
    //METHOD_OVERRIDE_FROM_TRIANGLE
    public void setWidth(int width) {
        super.setWidth(width);
    }

    //METHOD_OVERRIDE_FROM_TRIANGLE
    public void setHeight(int height) {
        super.setHeight(height);
    }

    public  int getCount() {
        return count++;
    }
}
