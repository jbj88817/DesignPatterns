package us.bojie.design.pattern.structural.decorator.v1;

public class BattercakewithEggSausage extends BattercakewithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " add a sausage";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
