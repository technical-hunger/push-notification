package com.technicalhunger.notification.service;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private FirebaseApp firebaseApp;
    public void sendPushNotification(String token, String title, String message) throws FirebaseMessagingException, FirebaseMessagingException {
        Message firebaseMessage = Message.builder()
                .setToken(token)
                .setNotification(Notification.builder().setTitle(title).setBody(message).build())
                .build();

        FirebaseMessaging.getInstance(firebaseApp).send(firebaseMessage);
    }
}
