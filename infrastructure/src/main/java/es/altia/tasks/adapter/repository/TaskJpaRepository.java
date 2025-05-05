package es.altia.tasks.adapter.repository;

import es.altia.tasks.adapter.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskJpaRepository extends JpaRepository<TaskEntity, Long> {
}
