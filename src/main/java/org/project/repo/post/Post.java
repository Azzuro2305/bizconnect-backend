package org.project.repo.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Post extends JpaRepository<Post, UUID> {

}
