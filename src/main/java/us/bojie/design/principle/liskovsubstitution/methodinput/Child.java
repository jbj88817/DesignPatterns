package us.bojie.design.principle.liskovsubstitution.methodinput;

import java.util.Map;

public class Child extends Base {

//    @Override
//    public void method(HashMap map) {
//        System.out.println("Child hashmap");
//    }

    public void method(Map map) {
        System.out.println("Child map");
    }
}
