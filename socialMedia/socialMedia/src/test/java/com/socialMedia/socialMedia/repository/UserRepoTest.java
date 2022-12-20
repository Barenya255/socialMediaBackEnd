package com.socialMedia.socialMedia.repository;

import com.socialMedia.socialMedia.entity.User_data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepoTest {

    @Autowired
    private PersonRepo userRepo;

    @Test
    public void saveUser(){
        User_data dumbstruck = User_data.builder()
                .handler("allahuakbar")
                .firstName("Abdul")
                .lastName("Mir")
                .password("assadamhussainwaleikum")
                .build();
        userRepo.save(dumbstruck);
    }
}