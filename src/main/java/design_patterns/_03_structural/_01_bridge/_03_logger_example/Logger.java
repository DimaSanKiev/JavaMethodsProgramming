package design_patterns._03_structural._01_bridge._03_logger_example;

public abstract class Logger {
    protected LoggerImplementor logger;

    public Logger() {
    }

    public Logger(LoggerImplementor logger) {
        this.logger = logger;
    }

    public void setLogger(LoggerImplementor logger) {
        this.logger = logger;
    }

    public abstract void log();
}
