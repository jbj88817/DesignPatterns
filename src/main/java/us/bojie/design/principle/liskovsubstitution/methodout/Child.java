package us.bojie.design.principle.liskovsubstitution.methodout;

import java.util.HashMap;

public class Child extends Base {

    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("child");
        hashMap.put("message", "child");
        return hashMap;
    }
}
