

public class LoggerTest {
    public static void main(String[] args) {
        Logger firstLog = Logger.getInstance();
        firstLog.log("Starting application...");

        Logger secondLog = Logger.getInstance();
        secondLog.log("Application is running.");

       
        if (firstLog == secondLog) {
            System.out.println("Confirmed: Both logger instances are the same.");
        } else {
            System.out.println("Error: Different instances detected!");
        }
    }
}
