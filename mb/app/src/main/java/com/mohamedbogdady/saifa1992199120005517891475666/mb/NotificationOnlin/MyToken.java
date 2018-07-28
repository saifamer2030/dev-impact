package com.mohamedbogdady.saifa1992199120005517891475666.mb.NotificationOnlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.iid.FirebaseInstanceId;
import com.mohamedbogdady.saifa1992199120005517891475666.mb.R;

public class MyToken extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_token);
        System.out.println("MY Token :"+ FirebaseInstanceId.getInstance().getToken());
    }
}
