package com.socialMedia.socialMedia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "tbl_usr",
        uniqueConstraints = @UniqueConstraint(
                name = "handler_unique",
                columnNames = "handler_val"
        )
)
public class User_data {


    @Id
    @SequenceGenerator(
            name= "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(name = "user_id")
    private Long UUID;

    private LocalDateTime timeStamp;
    @Column(
            name = "First Name",
            nullable = false
    )
    private String firstName;


    @Column(
            name = "Last Name",
            nullable = false
    )
    private String lastName;


    @Column(
            name = "password",
            nullable = false
    )
    private String password;

    @Column(
            name = "handler_val",
            nullable = false
    )
    private String handler;
    //private image profile_pic;
}
