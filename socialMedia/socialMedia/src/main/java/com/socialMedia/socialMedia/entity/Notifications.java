package com.socialMedia.socialMedia.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GeneratorType;

import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name = "tbl_notifications")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notifications {
    @SequenceGenerator(
            name = "notification_sequence",
            sequenceName = "notification_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notification_sequence"
    )
    @Id
    private Long notification_id;
    private String body;
    private LocalDateTime timeStamp;
    private Long likes;


    @Override
    public String toString() {
        return "Notifications{" +
                "notification_id=" + notification_id +
                ", body='" + body + '\'' +
                ", time_stamp=" + timeStamp +
                ", likes=" + likes +
                '}';
    }

    @OneToMany(cascade = CascadeType.ALL,
    fetch = FetchType.LAZY)
    @JoinColumn(
            name = "notification_id",
            referencedColumnName = "notificationId"
    )
    private Collection<Comments> comments;

}
