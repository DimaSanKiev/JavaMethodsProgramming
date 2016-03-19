package design_patterns._03_structural._01_bridge._03_logger_example;

public class SingleThreadLogger implements LoggerImplementor {
    @Override
    public void logToConsole() {
        System.out.println("Singlethreaded console log.");
    }

    @Override
    public void logToFile() {
        System.out.println("Singlethreaded file log.");
    }

    @Override
    public void logToSocket() {
        System.out.println("Singlethreaded socket log.");
    }
}
