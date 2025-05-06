package es.altia.tasks.ports.driving;

import es.altia.tasks.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskUseCase {
    Task createTask(Task task);
    boolean deleteTask(Long id);
    Optional<Task> getTask(Long id);
    List<Task> getTasks();
    Optional<Task> updateTask(Long id, Task updateTask);
}
