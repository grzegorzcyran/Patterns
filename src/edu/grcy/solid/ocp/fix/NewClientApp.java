package edu.grcy.solid.ocp.fix;

public class NewClientApp {
    public static void main(String[] args) {
        MessageLogger messageLogger = new FileLogger();

        Logger logger = new Logger(messageLogger);
        try {
            logger.log("bbb");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
