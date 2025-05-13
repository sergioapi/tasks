package es.sergio.users.ports.driving;

import es.sergio.users.models.User;

import java.util.List;
import java.util.Optional;

public interface UserUseCase {
    User createUser(User user);
    boolean deleteUser(Long id);
    Optional<User> updateUser(Long id, User user);

    Optional<User> getUserById(Long id);
    List<User> getUsers();

    boolean authenticate(User user);
}
