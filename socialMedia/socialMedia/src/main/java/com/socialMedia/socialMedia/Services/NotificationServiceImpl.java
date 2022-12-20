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
        return null;
    }

    @Override
    public void deleleteNotification(Long identity) {
        notificationRepository.deleteById(identity);
        return;
    }
}
