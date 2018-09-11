package us.bojie.design.pattern.creational.singleton;

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL_INSTANCE_THREAD_LOCAL
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return THREAD_LOCAL_INSTANCE_THREAD_LOCAL.get();
    }
}
