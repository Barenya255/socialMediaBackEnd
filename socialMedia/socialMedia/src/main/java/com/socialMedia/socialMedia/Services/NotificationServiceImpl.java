package com.socialMedia.socialMedia.Services;

import com.socialMedia.socialMedia.entity.Notifications;
import com.socialMedia.socialMedia.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService{

    @Autowired
    private NotificationRepository notificationRepository;
    @Override
    public Notifications addNotification(Notifications notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public List<Notifications> viewAllNotifications() {
        return notificationRepository.findAll();
    }

    @Override
    public Notifications updateNotifications(Long identity, Notifications body) {
        /*we call the notificaitonRepositor and find the notificaitons which have the
        * id as identity.
        * Then, we update notification body with setNotificationBody(body)
        * .get() returns element at a given index.
        * Therefore, from the findById, we get multiple notifications, and then we take the first one.
        * Note, multiple notifications are not possible.*/
        Notifications notification = notificationRepository.findById(identity).get();
        notification.setBody(body.getBody());

        return notificationRepository.save(notification);
    }

    @Override
    public void deleleteNotification(Long identity) {
        /*To delete the repository, JPA is used.
        * The deleteById(Long) will return void and thus the function is defined as void*/
        notificationRepository.deleteById(identity);
        return;
    }

    @Override
    public String viewOneNotification(Long identity) {
        /*Must search comments Entity by notification id*/
        /*No default method available in the JPA repository.
        * We need to create our own method in the commentsRepository interface.*/

        /*This needs to be in the comments Services interface.
        * Implemented in the wrong place.*/
        return null;
    }
}
