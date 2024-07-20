package org.project.entity.User;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.Chat.ChatBox;
import org.project.entity.Friend.Friend;
import org.project.entity.Friend.FriendRequest;
import org.project.entity.Post.Comment;
import org.project.entity.Subscription.Subscription;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_statistics_id")
    private UserStatistics userStatistics;

    @Lob
    private String bio;
    @Lob
    private String address;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> roles;

    @OneToMany(mappedBy = "users")
    private Set<Friend> friends;

    @OneToMany(mappedBy = "sender")
    private Set<FriendRequest> sentFriendRequests;

    @OneToMany(mappedBy = "recipient")
    private Set<FriendRequest> receivedFriendRequests;

    @OneToMany(mappedBy = "users")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "users")
    private Set<WorkExperience> workExperiences;

    @OneToMany(mappedBy = "users")
    private Set<ChatBox> chatBoxes;

    @OneToMany(mappedBy = "users")
    private Set<UserProfileImages> userProfileImages;

    @OneToMany(mappedBy = "users")
    private Set<UserBannerImages> userBannerImages;

    private String userName;
    private String gender;
    private String age;
    private LocalDate dob;
    private String mail;
    private String phoneNumber;
    private String password;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isBanned;
    private boolean isDeleted;
}
