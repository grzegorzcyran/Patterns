package edu.grcy.solid.isp.fix;

import java.util.Collection;
import java.util.Collections;

public class FileLogger implements ReadableLogger {
    @Override
    public Collection<String> readMessages() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}
