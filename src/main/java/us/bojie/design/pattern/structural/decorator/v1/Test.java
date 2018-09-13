package us.bojie.design.pattern.structural.decorator.v1;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " Price: " + battercake.cost());

        BattercakewithEgg battercakewithEgg = new BattercakewithEgg();
        System.out.println(battercakewithEgg.getDesc() + " Price: " + battercakewithEgg.cost());

        BattercakewithEggSausage battercakewithEggSausage = new BattercakewithEggSausage();
        System.out.println(battercakewithEggSausage.getDesc() + " Price: " + battercakewithEggSausage.cost());
    }
}
