package org.project.entity.JobPost;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.User.Users;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String company;
    private String owner;

    @ManyToOne
    @JoinColumn(name = "registered_by")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "verified_by")
    private Users admin;

    private boolean isApproved;
    private String country;  // recheck this
    private String address;
    private long totalEmployee;
    private String sector;
    private LocalDate foundedDate;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
