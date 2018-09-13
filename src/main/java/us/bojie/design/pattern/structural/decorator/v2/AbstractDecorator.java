package us.bojie.design.pattern.structural.decorator.v2;

// 是否使用抽象类，看具体业务场景
public abstract class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    protected abstract void doSomeThing();

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    protected int cost() {
        return this.aBattercake.cost();
    }
}
