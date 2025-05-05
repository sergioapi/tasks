package es.altia.tasks.adapter.repository;

import es.altia.tasks.adapter.entity.TaskEntity;
import es.altia.tasks.adapter.mapper.TaskMapper;
import es.altia.tasks.model.Task;
import es.altia.tasks.ports.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class TaskRepositoryAdapter implements TaskRepository {

    private final TaskJpaRepository taskJpaRepository;
    private final TaskMapper taskMapper;

    @Override
    public Task save(Task task) {
        return taskMapper.toDomain(taskJpaRepository
                .save(taskMapper.toEntity(task)));
    }

    @Override
    public Task findById(Long id) {
        return taskJpaRepository.findById(id).map(taskMapper::toDomain).orElse(null);
    }

    @Override
    public List<Task> findAll() {
        List<TaskEntity> taskEntities = taskJpaRepository.findAll();
        System.out.println("Recuperado TaskEntities: " + taskEntities);
        List<Task> tasks = taskMapper.toDomainList(taskEntities);
        System.out.println("Mapped Tasks: " + tasks);
        return tasks;
        //return taskMapper.toDomainList(taskJpaRepository.findAll());
    }

    @Override
    public Task update(Task task) {
        return taskMapper.toDomain(taskJpaRepository
                .save(taskMapper.toEntity(task)));
    }

    @Override
    public boolean delete(Long id) {
        if (taskJpaRepository.existsById(id)) {
            taskJpaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
