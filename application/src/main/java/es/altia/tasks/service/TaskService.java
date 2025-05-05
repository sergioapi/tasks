package es.altia.tasks.service;

import es.altia.tasks.model.Task;
import es.altia.tasks.ports.TaskRepository;
import es.altia.tasks.usecase.TaskUseCase;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class TaskService implements TaskUseCase {
    private final TaskRepository taskRepository;


    @Override
    public Task createTask(Task task) {
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
