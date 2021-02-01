package edu.grcy.solid.dip.fix;

public class FileRepository implements Repository {
    @Override
    public void saveTask(String task) {
        System.out.println("Saving file" + task + " to filesystem");
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Deleting file " + task + "from filesystem");
    }
}
