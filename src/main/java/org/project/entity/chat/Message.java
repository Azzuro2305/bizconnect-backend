package org.project.entity.chat;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.user.Users;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users sender;

    @ManyToOne
    @JoinColumn(name = "chatbox_id")
    private ChatBox chatBox;

    @Lob
    private String message;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
