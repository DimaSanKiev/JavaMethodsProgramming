package design_patterns._03_structural._01_bridge._03_logger_example;

public interface LoggerImplementor {
    void logToConsole();

    void logToFile();

    void logToSocket();
}
