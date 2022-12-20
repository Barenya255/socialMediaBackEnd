package com.socialMedia.socialMedia.repository;

import com.socialMedia.socialMedia.entity.Notifications;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class NotificationsInterfaceTest {
    @Autowired
    private NotificationsInterface notificationsInterface;

    @Test
    public void insertNotif(){
        Notifications notification = Notifications.builder()
                .body("I am feeling depressed with 60 others")
                .time_stamp(0L)
                .likes(0L)
                .build();
        notificationsInterface.save(notification);
    }

    @Test
    public List<String> showNotifications(){
        List<Notifications> notifications = notificationsInterface.findAll();
        List<String> result = new ArrayList<String>();
        for(Notifications notification:notifications){
            result.add(notification.toString());
        }
        System.out.println(result);
        return result;
    }
}