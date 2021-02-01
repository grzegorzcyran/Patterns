package edu.grcy.solid.ocp.fix;

public class FileLogger implements MessageLogger {
    @Override
    public void log(String message) throws Exception {
        System.out.println("Adding to file : " + message);
    }
}
