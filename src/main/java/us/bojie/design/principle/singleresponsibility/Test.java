package us.bojie.design.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("dayan");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("dayan");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("tuoniao");
    }
}
