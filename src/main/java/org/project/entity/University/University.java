package org.project.entity.University;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.User.Qualification;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
    private Set<Qualification> qualifications;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
    private Set<FieldOfStudy> fieldOfStudies;

    private String name;
    private String address;
    private String postalCode;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
