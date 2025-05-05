package es.altia.tasks.ports;

import es.altia.tasks.model.Task;

import java.util.List;

public interface TaskRepository {
    Task save(Task task);

    boolean delete(Long id);

    Task findById(Long id);

    List<Task> findAll();

    Task update(Task updateTask);
}
