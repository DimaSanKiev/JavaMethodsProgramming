package design_patterns._03_structural._01_bridge._03_logger_example;

public class FileLogger extends Logger {
    public FileLogger() {
    }

    public FileLogger(LoggerImplementor logger) {
        super(logger);
    }

    @Override
    public void log() {
        logger.logToFile();
    }
}
