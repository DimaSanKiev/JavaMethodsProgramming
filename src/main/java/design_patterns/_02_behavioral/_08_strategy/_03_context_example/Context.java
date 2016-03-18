package design_patterns._02_behavioral._08_strategy._03_context_example;

import java.util.HashMap;
import java.util.Map;

public class Context {
    public final static int DEFAULT_ALGORITHM = 0;
    private Map<Integer, Strategy> algorithms = new HashMap<>();

    public Context(Strategy strategy) {
        // null check
        algorithms.put(DEFAULT_ALGORITHM, strategy);
    }

    public Context() {
        this(new DefaultStrategy());
    }

    public void registerAlgorithm(int key, Strategy strategy) {
        if (key != 0) {
            algorithms.put(key, strategy);
        }
    }

    public void registerDefaultAlgorithm(Strategy strategy) {
        // null check
        algorithms.put(DEFAULT_ALGORITHM, strategy);
    }

    public void contextStrategy(int key) {
        algorithms.get(key).doAlgorithm();
    }
}
