package edu.grcy.solid.dip.fix;

public class FileTest {
    public static void main(String[] args) {
        Repository repository = new FileRepository();

        TaskService service = new TaskService(repository);

        service.addTask("NewFile.txt");
        service.removeTask("OtherFile.txt");
    }
}
