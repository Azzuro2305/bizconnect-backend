package org.project.entity.Chat;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.User.Users;
import org.project.enums.ChatRoomType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatBox {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToMany
    @JoinTable(
            name = "user_chatbox",
            joinColumns = @JoinColumn(name = "chatbox_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<Users> users;

    @OneToMany
    private List<Message> messages;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "chatroom_type", nullable = false)
    private ChatRoomType chatRoomType;

    private String name;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
