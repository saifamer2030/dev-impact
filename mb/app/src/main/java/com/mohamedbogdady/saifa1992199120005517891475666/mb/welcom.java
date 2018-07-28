package com.mohamedbogdady.saifa1992199120005517891475666.mb;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class welcom extends AppCompatActivity {
ImageView imageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom);
        imageView = (ImageView) findViewById(R.id.imageView);
        Animation animation ;
        Thread thread = new Thread(){
            @Override
            public void run() {

                try {
                    sleep(6000);
                    Intent intent = new Intent(getApplicationContext(),CV.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };
        thread.start();
        animation = AnimationUtils.loadAnimation(welcom.this,R.anim.scale);
        imageView.setAnimation(animation);

        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        Bitmap bitmap = BitmapFactory.decodeResource(welcom.this.getResources(),R.mipmap.logo);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext())

                .setSmallIcon(R.mipmap.logo)
                .setContentTitle("Welcome to my application")
                .setContentText("Ask for your service and do not hesitate")
                .setLargeIcon(bitmap)
                .setNumber(1)
                .setAutoCancel(true);

        mBuilder.setDefaults(Notification.DEFAULT_VIBRATE);
        mBuilder.setVibrate(new long[]{500,1000,500,2000,500,1000});
        notificationManager.notify(1 ,mBuilder.build());


    }


}
