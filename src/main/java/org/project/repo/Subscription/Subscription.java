package org.project.repo.Subscription;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Subscription extends JpaRepository<Subscription, UUID> {
}
