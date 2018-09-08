package us.bojie.design.principle.liskovsubstitution;

public class Square implements Quadrangle{
    private long sideLength;

    public long getWidth() {
        return sideLength;
    }

    public long getLength() {
        return sideLength;
    }
}
