package org.project.entity.Chat;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.User.Users;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IndividualChat {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "sender_id")
    private Users sender;

    @OneToOne
    @JoinColumn(name = "recipient_id")
    private Users recipient;

    @OneToOne
    @JoinColumn(name = "chatbox_id")
    private ChatBox chatBox;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
