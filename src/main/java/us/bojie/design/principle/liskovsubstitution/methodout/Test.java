package us.bojie.design.principle.liskovsubstitution.methodout;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}
