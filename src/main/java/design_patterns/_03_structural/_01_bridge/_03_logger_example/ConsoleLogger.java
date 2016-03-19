package design_patterns._03_structural._01_bridge._03_logger_example;

public class ConsoleLogger extends Logger {
    public ConsoleLogger() {
    }

    public ConsoleLogger(LoggerImplementor logger) {
        super(logger);
    }

    @Override
    public void log() {
        logger.logToConsole();
    }
}
