package design_patterns._01_creational._04_singleton._01_implementations;

import java.util.concurrent.locks.ReentrantLock;

// Lock for Singleton
public class LockImpl {
    private static LockImpl instance = null;
    private static ReentrantLock lock = new ReentrantLock();

    private LockImpl() {
    }

    public static LockImpl getInstance() {
        lock.lock();    // blocking
        try {
            if (instance == null) {
                instance = new LockImpl();
            }
        } finally {
            lock.unlock();
        }
        return instance;
    }
}
