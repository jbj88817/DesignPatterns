package us.bojie.design.pattern.structural.decorator.v1;

public class BattercakewithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + " add a egg";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
