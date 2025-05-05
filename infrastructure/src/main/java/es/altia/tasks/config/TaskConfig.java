package es.altia.tasks.config;

import es.altia.tasks.ports.TaskRepository;
import es.altia.tasks.service.TaskService;
import es.altia.tasks.usecase.TaskUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

    @Bean
    public TaskUseCase taskUseCase(TaskRepository taskRepository) {
        return new TaskService(taskRepository);
    }
}
