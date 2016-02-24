package design_patterns._01_creational._04_singleton._01_implementations;

// Singleton Bill Pugh's solution
public class LazyInitImpl {
    private LazyInitImpl() {
    }

    private static class SingletonHolder {      // nested class
        private final static LazyInitImpl INSTANCE = new LazyInitImpl();
    }

    public static LazyInitImpl getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
