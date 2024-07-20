package org.project.repo.university;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface University extends JpaRepository<University, UUID> {

}
