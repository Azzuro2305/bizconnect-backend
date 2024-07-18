package org.project.entity.Friend;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.User.Users;
import org.project.enums.FriendRequestStatus;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "friend_id")
    private Users friend;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
