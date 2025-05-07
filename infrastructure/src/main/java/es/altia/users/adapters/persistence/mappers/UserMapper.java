package es.altia.users.adapters.persistence.mappers;

import es.altia.users.adapters.persistence.entities.UserEntity;
import es.altia.users.models.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(User user);
    User toDomain(UserEntity userEntity);

    List<User> toDomainList(List<UserEntity> userEntities);
}
