package org.project.repo.University;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FieldOfStudy extends JpaRepository<FieldOfStudy, UUID> {

}
