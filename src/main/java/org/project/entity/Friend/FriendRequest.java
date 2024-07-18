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
public class FriendRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Users sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Users recipient;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status")
    private FriendRequestStatus status;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
