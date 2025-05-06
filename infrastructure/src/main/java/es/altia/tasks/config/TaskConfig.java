package es.altia.tasks.config;

import es.altia.tasks.ports.driven.TaskRepository;
import es.altia.tasks.usescases.TaskUseCaseImpl;
import es.altia.tasks.ports.driving.TaskUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

    @Bean
    public TaskUseCase taskUseCase(TaskRepository taskRepository) {
        return new TaskUseCaseImpl(taskRepository);
    }
}
