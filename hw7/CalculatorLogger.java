import java.util.logging.*;

public class CalculatorLogger {
    private static CalculatorLogger instance;
    private Logger logger;

    private CalculatorLogger() {
        logger = Logger.getLogger(CalculatorLogger.class.getName());
    }

    public static CalculatorLogger getInstance() {
        if (instance == null) {
            instance = new CalculatorLogger();
        }
        return instance;
    }

    public void log(String message) {
        logger.log(Level.INFO, message);
    }
}

