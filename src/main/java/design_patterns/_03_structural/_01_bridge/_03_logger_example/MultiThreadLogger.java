package design_patterns._03_structural._01_bridge._03_logger_example;

public class MultiThreadLogger implements LoggerImplementor {
    @Override
    public void logToConsole() {
        System.out.println("Multithreaded console log.");
    }

    @Override
    public void logToFile() {
        System.out.println("Multithreaded file log.");
    }

    @Override
    public void logToSocket() {
        System.out.println("Multithreaded socket log.");
    }
}
