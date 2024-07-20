package org.project.entity.jobPost;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.user.Users;

import java.time.LocalDateTime;
import java.util.Set;
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

    @OneToMany(mappedBy = "jobType", cascade = CascadeType.ALL)
    private Set<JobType> jobTypes;

    private String name;
    private boolean isVerified;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
