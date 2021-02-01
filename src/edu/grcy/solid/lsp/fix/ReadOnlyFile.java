package edu.grcy.solid.lsp.fix;

public class ReadOnlyFile implements FileReadable {
    @Override
    public byte[] read() {
        return new byte[0];
    }
}
