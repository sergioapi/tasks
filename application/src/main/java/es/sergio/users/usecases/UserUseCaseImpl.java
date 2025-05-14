package es.sergio.users.usecases;

import es.sergio.users.models.User;
import es.sergio.users.ports.driven.UserRepository;
import es.sergio.users.ports.driving.UserUseCase;
import es.sergio.shared.annotations.UseCase;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@UseCase
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
