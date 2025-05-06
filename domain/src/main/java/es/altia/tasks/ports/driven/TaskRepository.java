package es.altia.tasks.ports.driven;

import es.altia.tasks.models.Task;

import java.util.List;

public interface TaskRepository {
    Task save(Task task);

    boolean delete(Long id);

    Task findById(Long id);

    List<Task> findAll();

    Task update(Task updateTask);
}
