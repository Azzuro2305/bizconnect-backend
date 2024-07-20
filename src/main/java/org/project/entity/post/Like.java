package org.project.entity.post;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.user.Users;
import org.project.enums.ReactionType;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Likes", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "post_id", "reaction_type"}),
        @UniqueConstraint(columnNames = {"user_id", "image_id", "reaction_type"})
})

public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "image_id")
    private SubPost subPost;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "reaction_type", nullable = false)
    private ReactionType reactionType;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
