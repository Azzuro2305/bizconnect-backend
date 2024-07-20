package org.project.repo.jobPost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JobType extends JpaRepository<JobType, UUID> {

}
