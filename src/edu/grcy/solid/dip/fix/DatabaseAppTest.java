package edu.grcy.solid.dip.fix;

public class DatabaseAppTest {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepository();
        TaskService service = new TaskService(repository);

        service.addTask("aaa.xxx");
        service.removeTask("bbb.xxx");
    }
}
