package us.bojie.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java1", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("ID: " + javaCourse.getId() + " name: "
                + javaCourse.getName()
                + " price: " + javaCourse.getOriginPrice()
                + " discounted price: " + javaCourse.getPrice());
    }
}
