package org.project.repo.JobPost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JobPost extends JpaRepository<JobPost, UUID> {

}
