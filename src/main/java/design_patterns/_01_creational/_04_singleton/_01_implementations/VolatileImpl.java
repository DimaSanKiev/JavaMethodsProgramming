package design_patterns._01_creational._04_singleton._01_implementations;

// Volatile for Singleton
public class VolatileImpl {
    private static VolatileImpl instance = null;
    private volatile static boolean instanceCreated = false;

    private VolatileImpl() {
    }

    public static VolatileImpl getInstance() {
        if (!instanceCreated) {
            synchronized (VolatileImpl.class) {
                // or any other blocking type, e.g. Lock or Semaphore
                try {
                    if (!instanceCreated) {
                        instance = new VolatileImpl();
                        instanceCreated = true;
                    }
                } catch (Exception e) {
                    // initialization exception handling
                }
            }
        }
        return instance;
    }
}
