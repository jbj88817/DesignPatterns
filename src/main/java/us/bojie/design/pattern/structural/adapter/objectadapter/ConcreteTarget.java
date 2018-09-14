package us.bojie.design.pattern.structural.adapter.objectadapter;


public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("ConcreteTarget");
    }
}
