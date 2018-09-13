package us.bojie.design.pattern.structural.decorator.v2;

public class EggDecorator extends AbstractDecorator {

    protected void doSomeThing() {

    }

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " add a egg";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
