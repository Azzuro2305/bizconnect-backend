package org.project.entity.JobPost;

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
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @Lob
    private String description;

    private String title;
    private String category;
    private String type;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
