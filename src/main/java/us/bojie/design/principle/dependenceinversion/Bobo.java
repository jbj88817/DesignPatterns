package us.bojie.design.principle.dependenceinversion;

public class Bobo {

    private ICourse iCourse;

    public Bobo() {
    }

    public void setICourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }
}
