package edu.grcy.solid.ocp.fix;

public class DatabaseLogger implements MessageLogger {

    @Override
    public void log(String message) throws Exception {
        System.out.println("Sending log to DB: " + message);
    }
}
