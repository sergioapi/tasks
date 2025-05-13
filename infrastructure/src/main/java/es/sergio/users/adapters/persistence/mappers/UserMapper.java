package es.sergio.users.adapters.persistence.mappers;

import es.sergio.users.adapters.persistence.entities.UserEntity;
import es.sergio.users.models.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(User user);
    User toDomain(UserEntity userEntity);

    List<User> toDomainList(List<UserEntity> userEntities);
}
