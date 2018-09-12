package us.bojie.design.pattern.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable, Cloneable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("Singleton don't use reflect");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    // for serializable
    private Object readResolve() {
        return hungrySingleton;
    }

    // For cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
