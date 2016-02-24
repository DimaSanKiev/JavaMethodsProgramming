package design_patterns._01_creational._04_singleton._01_implementations;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

// Semaphore for Singleton
public class SemaphoreImpl {
    private static final int MAX_AVAILABLE = 10;    // limit of instances in list
    private static Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);
    private static ArrayList<SemaphoreImpl> instances = new ArrayList<>(MAX_AVAILABLE);

    private SemaphoreImpl() {
    }

    public static SemaphoreImpl getInstance(int index) throws SingletonException {
        if (index >= 0 && index < instances.size()) {     // access to list item
            return instances.get(index);
        }
        if (semaphore.tryAcquire()) {       // reduction of semaphore amount by 1
            SemaphoreImpl tmp = new SemaphoreImpl();
            instances.add(tmp);
            return tmp;
        }
        throw new SingletonException("Limit of instances exceeded");
    }
}
