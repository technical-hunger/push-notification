package com.technicalhunger.notification.controller;

import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Notification;
import com.technicalhunger.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/{title}/{message}")
    public String sendNotification(@RequestParam String token, @PathVariable String title, @PathVariable String message){
        try {
            notificationService.sendPushNotification(token,title, message);
            return "Notification is sent";
        } catch (FirebaseMessagingException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
