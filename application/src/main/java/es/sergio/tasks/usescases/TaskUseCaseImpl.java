package es.sergio.tasks.usescases;

import es.sergio.tasks.models.Task;
import es.sergio.tasks.ports.driven.TaskRepository;
import es.sergio.tasks.ports.driving.TaskUseCase;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class TaskUseCaseImpl implements TaskUseCase {
    private final TaskRepository taskRepository;


    @Override
    public Task createTask(Task task) {
        task.setCreationDate(LocalDateTime.now());
        return taskRepository.save(task);
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepository.delete(id);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return Optional.ofNullable(taskRepository.findById(id));
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return Optional.ofNullable(taskRepository.update(updateTask));
    }
}
