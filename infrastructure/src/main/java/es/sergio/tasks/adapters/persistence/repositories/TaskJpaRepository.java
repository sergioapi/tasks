package es.sergio.tasks.adapters.persistence.repositories;

import es.sergio.tasks.adapters.persistence.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskJpaRepository extends JpaRepository<TaskEntity, Long> {
}
