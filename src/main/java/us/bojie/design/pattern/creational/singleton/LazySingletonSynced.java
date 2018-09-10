package us.bojie.design.pattern.creational.singleton;

// 懒汉线程安全式：延时加载，但synchronized导致性能缺陷
public class LazySingletonSynced {
    private static LazySingletonSynced lazySingleton = null;
    private static boolean flag = true;

    private LazySingletonSynced() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("Singleton don't use reflect");
        }
    }

    public synchronized static LazySingletonSynced getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingletonSynced();
        }
        return lazySingleton;
    }
}
