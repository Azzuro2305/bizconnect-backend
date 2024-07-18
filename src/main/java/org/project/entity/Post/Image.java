package org.project.entity.Post;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_statistics_id")
    private ImageStatistics imageStatistics;

    @Lob
    private String caption;
    private String url;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
