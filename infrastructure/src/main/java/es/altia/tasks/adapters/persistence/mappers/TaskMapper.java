package es.altia.tasks.adapters.persistence.mappers;

import es.altia.tasks.adapters.persistence.entities.TaskEntity;
import es.altia.tasks.models.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskEntity toEntity(Task task);

    Task toDomain(TaskEntity taskEntity);

    List<Task> toDomainList(List<TaskEntity> taskEntities);
}
