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
public class JobType {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private Users users;

    private String name;
    private boolean isVerified;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
