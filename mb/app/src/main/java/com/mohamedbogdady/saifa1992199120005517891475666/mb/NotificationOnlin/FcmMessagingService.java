package com.mohamedbogdady.saifa1992199120005517891475666.mb.NotificationOnlin;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.mohamedbogdady.saifa1992199120005517891475666.mb.R;




public class FcmMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
//        super.onMessageReceived(remoteMessage);

        if (remoteMessage.getData().size() > 0) {
            String title = remoteMessage.getNotification().getTitle();
            String message = remoteMessage.getNotification().getBody();

         Intent i = new Intent(this, MyToken.class);

           i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);


            PendingIntent notification = PendingIntent.getActivity(FcmMessagingService.this, 0, i, PendingIntent.FLAG_ONE_SHOT);

            NotificationCompat.Builder builder = new NotificationCompat.Builder(FcmMessagingService.this);
            builder.setSmallIcon(R.drawable.logo_22);
            builder.setContentTitle(title);
            builder.setContentText(message);
            //  builder.addAction(R.drawable.ic_reply_black_24dp, "فتح الدعاء ", pendOpne);
            //builder.addAction(R.drawable.ic_share_black_24dp, " مشاركة ", pend_Page3);
            builder.setContentIntent(notification);
            builder.setDefaults(NotificationCompat.DEFAULT_SOUND);
            builder.setAutoCancel(true);

            NotificationManager mm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            mm.cancel(1);
            mm.notify(1, builder.build());
        }
    }
}

