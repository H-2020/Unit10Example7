package inheritance;

public class IsoScelesTriangle extends Triangle{

    private static int  isoScelesTriangleCount;

    public IsoScelesTriangle() {
        isoScelesTriangleCount++;
    }

    public IsoScelesTriangle(int height, int width, int perpendicular) {
        super(height, width, perpendicular);
        isoScelesTriangleCount++;
    }

    public IsoScelesTriangle(int height, int width, int perpendicular, int x, int y) {
        super(height, width, perpendicular, x, y);
        isoScelesTriangleCount++;
    }

    public IsoScelesTriangle(IsoScelesTriangle isoScelesTriangle) {
        this(isoScelesTriangle.getWidth(),isoScelesTriangle.getHeight(),isoScelesTriangle.getPerpendicular());
        isoScelesTriangleCount++;
    }
    //METHOD_OVERRIDE_FROM_TRIANGLE
    public void setWidth(int width) {
        super.setWidth(width);
    }

    //METHOD_OVERRIDE_FROM_TRIANGLE
    public void setHeight(int height) {
        super.setHeight(height);
    }

    public static int getCount() {
        return isoScelesTriangleCount;
    }
}

