package edu.grcy.solid.lsp.fix;

public class LSPTest {
    public static void main(String[] args) {

        FileWritable writable = new File();

        writable.write("aaa".getBytes());

        FileReadable readable = new File();
        System.out.println(readable.read());

        FileReadable anotherReadable = new ReadOnlyFile();
        System.out.println(anotherReadable.read());
    }
}
