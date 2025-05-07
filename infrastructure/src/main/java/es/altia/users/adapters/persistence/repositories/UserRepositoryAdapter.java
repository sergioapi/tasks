package es.altia.users.adapters.persistence.repositories;

import es.altia.users.adapters.persistence.mappers.UserMapper;
import es.altia.users.models.User;
import es.altia.users.ports.driven.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepositoryAdapter implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;


    @Override
    public User findById(Long id) {
        return userJpaRepository.findById(id).map(userMapper::toDomain).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userMapper.toDomainList(userJpaRepository.findAll());
    }

    @Override
    public boolean existsByUserName(String name) {
        return false;
    }

    @Override
    public boolean existsByEmail(String email) {
        return false;
    }

    @Override
    public User save(User user) {
        return userMapper.toDomain(userJpaRepository.save(userMapper.toEntity(user)));
    }

    @Override
    public boolean delete(Long id) {
        if (userJpaRepository.existsById(id)) {
            userJpaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public User update(User user) {
        return userMapper.toDomain(userJpaRepository.save(userMapper.toEntity(user)));
    }
}
