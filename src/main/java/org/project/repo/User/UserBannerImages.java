package org.project.repo.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserBannerImages extends JpaRepository<UserBannerImages, UUID> {

}
