package es.altia.users.usecases;

import es.altia.users.models.User;
import es.altia.users.ports.driven.UserRepository;
import es.altia.users.ports.driving.UserUseCase;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class UserUseCaseImpl implements UserUseCase {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepository.delete(id);
    }

    @Override
    public Optional<User> updateUser(Long id, User user) {
        return Optional.ofNullable(userRepository.update(user));
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(userRepository.findById(id));
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean authenticate(User user) {
        return userRepository.existsByUserName(user.getName()) || userRepository.existsByEmail(user.getEmail());
    }
}
