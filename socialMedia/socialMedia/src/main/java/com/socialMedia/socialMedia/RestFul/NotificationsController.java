package com.socialMedia.socialMedia.RestFul;


import com.socialMedia.socialMedia.Services.NotificationService;
import com.socialMedia.socialMedia.entity.Notifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*The following is a Rest Controller class for handling Notifications of the social media project.
* We Shall use this to add, view, delete or update objects of Type Notifications from table name
* "tbl_notifications".
*
* This class uses a Services and repository class for the sake of object oriented design*/
@RestController
public class NotificationsController {
    /*
    * Description of Notifications entity class:
    *   private Long notification_id;
        private String body;
        private Long time_stamp;
        private Long likes;
    *
    */
    @Autowired
    private NotificationService notificationService;


    //To add a new notification to the database.
    /*POST http request with a JSON is applicable to this method
    * The notification added will be returned as a <Notification> type.*/
    @PostMapping("api/v1/notifications")
    public Notifications newNotification(@RequestBody Notifications notification){
        return notificationService.addNotification(notification);
    }

    /*GET http request,o parameters are required for this.
    A list of objects of type <Notification> will be returned*/
    @GetMapping("api/v1/notifcations")
    public List<Notifications> viewNotifications(){
        return notificationService.viewAllNotifications();
    }

    /*The following will enable viewing only a particular post and all the comments withing it*/
    @GetMapping("api/v1/notifications/{id}")
    public String viewOneNotification(@PathVariable("id") Long identity){
        return notificationService.viewOneNotification(identity);
    }

    /*PUT http request, we use this to make changes to the body of the notification.*/
    @PutMapping("api/v1/notifications/{id}")
    public Notifications updateNotifications(@PathVariable("id") Long identity, @RequestBody Notifications body){
        return notificationService.updateNotifications(identity, body);
    }

    /*DELETE http request, we use this to delete a notification from the tabel*/
    @DeleteMapping("api/v1/notifications/{id}")
    public void  deleteNotification(@PathVariable("id") Long identity){
        notificationService.deleleteNotification(identity);
        System.out.println("Successfully deleted the notification");
        return;
    }

}
