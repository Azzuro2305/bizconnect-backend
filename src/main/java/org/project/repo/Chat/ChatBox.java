package org.project.repo.Chat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChatBox extends JpaRepository<ChatBox, UUID> {

}
