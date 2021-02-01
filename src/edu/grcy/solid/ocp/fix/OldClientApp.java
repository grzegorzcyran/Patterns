package edu.grcy.solid.ocp.fix;

public class OldClientApp {
    public static void main(String[] args) {
        MessageLogger messageLogger = new ConsoleLogger();
        Logger logger = new Logger(messageLogger);
        try {
            logger.log("aaaa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
