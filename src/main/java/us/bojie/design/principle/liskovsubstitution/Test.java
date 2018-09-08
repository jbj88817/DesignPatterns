package us.bojie.design.principle.liskovsubstitution;

public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setLength(rectangle.getWidth() + 1);
            System.out.println("width: " + rectangle.getWidth() + "length: " + rectangle.getLength());
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
}
