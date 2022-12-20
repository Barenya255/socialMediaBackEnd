package com.socialMedia.socialMedia.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GeneratorType;

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
    private Long time_stamp;
    private Long likes;


    @Override
    public String toString() {
        return "Notifications{" +
                "notification_id=" + notification_id +
                ", body='" + body + '\'' +
                ", time_stamp=" + time_stamp +
                ", likes=" + likes +
                '}';
    }
}
