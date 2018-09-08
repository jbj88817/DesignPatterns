package us.bojie.design.principle.dependenceinversion;

public class Test {
    //v1
//    public static void main(String[] args) {
//        Bobo bobo = new Bobo();
//        bobo.studyFECourse();
//        bobo.studyJavaCourse();
//    }

    //v2
//    public static void main(String[] args) {
//        Bobo bobo = new Bobo();
//        bobo.studyCourse(new JavaCourse());
//        bobo.studyCourse(new FECourse());
//    }

    //v3
//    public static void main(String[] args) {
//        Bobo bobo = new Bobo(new JavaCourse());
//        bobo.studyCourse();
//    }

    public static void main(String[] args) {
        Bobo bobo = new Bobo();
        bobo.setICourse(new JavaCourse());
        bobo.studyCourse();

        bobo.setICourse(new FECourse());
        bobo.studyCourse();
    }
}
