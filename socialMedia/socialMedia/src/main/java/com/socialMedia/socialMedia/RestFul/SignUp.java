package com.socialMedia.socialMedia.RestFul;

import com.socialMedia.socialMedia.entity.User_data;
import com.socialMedia.socialMedia.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/sign_up")
public class SignUp {

    @Autowired
    private PersonRepo userRepo;

    public SignUp(PersonRepo userRepo){
        this.userRepo = userRepo;
    }

    @PostMapping
    public void addAccount(String firstName, String LastName, String handler, String password){
        {
            User_data dumbstruck = User_data.builder()
                    .handler(handler)
                    .firstName(firstName)
                    .lastName(LastName)
                    .password(password)
                    .build();
            userRepo.save(dumbstruck);
        }

    }
}
