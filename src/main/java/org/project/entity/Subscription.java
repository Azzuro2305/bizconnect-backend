package org.project.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Lob
    private String description;

    private String name;
    private double price;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
