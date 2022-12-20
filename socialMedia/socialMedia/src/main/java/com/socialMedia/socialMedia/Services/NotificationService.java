package com.socialMedia.socialMedia.Services;

import com.socialMedia.socialMedia.entity.Notifications;

import java.util.List;

public interface NotificationService {
    Notifications addNotification(Notifications notification);

    List<Notifications> viewAllNotifications();

    Notifications updateNotifications(Long identity, Notifications body);

    void deleleteNotification(Long identity);
}
