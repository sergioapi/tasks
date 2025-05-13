package es.sergio.users.config;

import es.sergio.users.ports.driven.UserRepository;
import es.sergio.users.ports.driving.UserUseCase;
import es.sergio.users.usecases.UserUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserUseCase userUseCase(UserRepository userRepository) {return new UserUseCaseImpl(userRepository);
    }
}
