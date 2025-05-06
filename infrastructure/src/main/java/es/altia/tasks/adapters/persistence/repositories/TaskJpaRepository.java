package es.altia.tasks.adapters.persistence.repositories;

import es.altia.tasks.adapters.persistence.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskJpaRepository extends JpaRepository<TaskEntity, Long> {
}
