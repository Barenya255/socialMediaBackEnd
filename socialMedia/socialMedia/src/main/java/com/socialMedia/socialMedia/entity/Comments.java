package com.socialMedia.socialMedia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Table(name = "tbl_comment")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comments {

    private Long notificationId;
    private LocalDateTime timeStamp;
    @Id
    private Long CommentId;
    private String CommentBody;

    @ManyToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "notification_id",
            referencedColumnName = "notification_id"
    )
    private Notifications notification;
}
