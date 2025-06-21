

public class Logger {
    private static Logger loggerInstance = null;

    
    private Logger() {
        System.out.println("Logger initialized...");
    }

    
    public static Logger getInstance() {
        if (loggerInstance == null) {
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
