package us.bojie.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 1. 分配内存给这个对象
                    // 2. 初始化对象
                    // 3. 设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 步骤2,3可能会颠倒，所以对象有可能还没初始化完毕
                    // 解决方法是加volatile 关键字
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
