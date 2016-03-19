package design_patterns._03_structural._01_bridge._03_logger_example;

public class BridgeClientMain {
    public static void main(String[] args) {
        LoggerImplementor loggerImpl = new SingleThreadLogger();
        Logger logger = new ConsoleLogger(loggerImpl);
        logger.log();

        loggerImpl = new MultiThreadLogger();
        logger.setLogger(loggerImpl);
        logger.log();
        new FileLogger(loggerImpl).log();
    }
}
