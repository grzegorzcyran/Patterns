package edu.grcy.solid.dip.fix;

public class TaskService {
    private Repository repository;

    //dependency injection
    //czyli wstrzykiwanie zależności
    //czyli klasa nie powinna tworzyć obiektów od których zależy jej działanie
    //powinna te obiekty dostać
    // - w konstruktorze (np. Spring)
    // - w setterze (np. Spring)
    // - jakoś inaczej (np. Spring inicjuje za pomocą pola)
    public TaskService(Repository repository) {
        this.repository = repository;
    }

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(String task) {
        repository.deleteTask(task);
    }
}
