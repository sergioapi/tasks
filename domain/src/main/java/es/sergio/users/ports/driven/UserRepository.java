package es.sergio.users.ports.driven;

import es.sergio.users.models.User;

import java.util.List;

public interface UserRepository {

    User findById(Long id);
    List<User> findAll();

    boolean existsByUserName(String name);
    boolean existsByEmail(String email);

    User save(User user);
    boolean delete(Long id);
    User update(User user);

}
