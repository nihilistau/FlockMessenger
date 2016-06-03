package com.bsg.apps.flockmessenger.services;

import android.content.Intent;
import android.os.IBinder;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public MyFirebaseMessagingService() {
        //
    }

    @Override
    public void onCreate() {
        //MyFirebaseMessagingService.NOTIFICATION_SERVICE
        FirebaseMessaging firebaseMessaging;
        RemoteMessage remoteMessage;
        RemoteMessage build; onMessageReceived(remoteMessage);





    @Override
    final IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
        //
    }


    public void handleIntent(Intent intent){

    }

    @Override
    public void onDeletedMessages(){

    }

    @Override
    public void onMessageReceived(RemoteMessage message) {

    }

    @Override
    public void onMessageSent(String msgId) {

    }

    @Override
    public void onSendError(String msgId, Exception exception) {

    }

    @Override
     final  int onStartCommand(Intent originalIntent, int flags, int startId) {

    }





    @Override
    public void onDestroy(){
        super.onDestroy();
        //
    }
}