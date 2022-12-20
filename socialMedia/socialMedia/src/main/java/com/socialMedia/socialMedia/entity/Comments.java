package com.socialMedia.socialMedia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name = "tbl_comment")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comments {
    private Long notificationId;
    @Id
    private Long CommentId;
    private String CommentBody;
    private Date timeStamp;
}
