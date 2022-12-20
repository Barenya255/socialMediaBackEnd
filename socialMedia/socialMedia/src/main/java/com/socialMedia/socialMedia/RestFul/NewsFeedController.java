package com.socialMedia.socialMedia.RestFul;

import com.socialMedia.socialMedia.entity.Notifications;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsFeedController {
    @GetMapping("api/v1/feed")
    public List<Notifications> viewFeed(){
        return null;
    }
}
