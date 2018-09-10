package us.bojie.design.pattern.creational.singleton;

// 懒汉式：延时加载，线程不安全
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton() {}

    public static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
