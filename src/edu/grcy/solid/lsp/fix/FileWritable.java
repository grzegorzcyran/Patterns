package edu.grcy.solid.lsp.fix;

@FunctionalInterface
public interface FileWritable {
    void write(byte[] data);
}
