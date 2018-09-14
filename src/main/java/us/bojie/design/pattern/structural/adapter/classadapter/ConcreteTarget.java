package us.bojie.design.pattern.structural.adapter.classadapter;

public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("ConcreteTarget");
    }
}
