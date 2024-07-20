package org.project.repo.friend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Friend extends JpaRepository<Friend, UUID> {

}
