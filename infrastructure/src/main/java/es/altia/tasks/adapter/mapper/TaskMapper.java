package es.altia.tasks.adapter.mapper;

import es.altia.tasks.adapter.entity.TaskEntity;
import es.altia.tasks.model.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskEntity toEntity(Task task);

    Task toDomain(TaskEntity taskEntity);

    List<Task> toDomainList(List<TaskEntity> taskEntities);
}
