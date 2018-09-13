package us.bojie.design.pattern.structural.decorator.v2;

public class SausageDecorator extends AbstractDecorator {

    protected void doSomeThing() {

    }

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " add a sausage";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
