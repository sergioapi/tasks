package es.sergio.tasks.config;

import es.sergio.tasks.ports.driven.TaskRepository;
import es.sergio.tasks.usescases.TaskUseCaseImpl;
import es.sergio.tasks.ports.driving.TaskUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

    @Bean
    public TaskUseCase taskUseCase(TaskRepository taskRepository) {
        return new TaskUseCaseImpl(taskRepository);
    }
}
