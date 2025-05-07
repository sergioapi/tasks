package es.altia.users.config;

import es.altia.users.ports.driven.UserRepository;
import es.altia.users.ports.driving.UserUseCase;
import es.altia.users.usecases.UserUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserUseCase userUseCase(UserRepository userRepository) {return new UserUseCaseImpl(userRepository);
    }
}
