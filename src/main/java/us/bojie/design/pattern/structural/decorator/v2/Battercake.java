package us.bojie.design.pattern.structural.decorator.v2;

public class Battercake extends ABattercake{
    protected String getDesc() {
        return "Battercake";
    }

    protected int cost() {
        return 8;
    }
}
