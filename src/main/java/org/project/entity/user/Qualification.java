package org.project.entity.user;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.university.FieldOfStudy;
import org.project.entity.university.University;
import org.project.enums.QualificationType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "qualification_type_id", nullable = false)
    private QualificationType qualificationType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "field_of_study_id")
    private FieldOfStudy fieldOfStudy;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    private String qualification;
    private LocalDate fromDate;
    private LocalDate toDate;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
