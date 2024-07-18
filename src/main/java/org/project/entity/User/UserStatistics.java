package org.project.entity.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private long follower;
    private long following;
    private long sentFriendRequest;
    private long receivedFriendRequest;
    private long friend;
    private long post;
    private long jobPost;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
