package com.mohamedbogdady.saifa1992199120005517891475666.mb.ChatRoom;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.mohamedbogdady.saifa1992199120005517891475666.mb.R;

public class MainActivity_chate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chate);

        AlertDialog dialog = new AlertDialog.Builder(this).create();
        final EditText editText = new EditText(this);
        dialog.setTitle("Enter Your Name");
        dialog.setView(editText);
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String name = editText.getText().toString();
                if (!TextUtils.isEmpty(name)) {
                    Intent intent = new Intent(MainActivity_chate.this, ChateRoom.class);
                    intent.putExtra("Name", name);
                    startActivity(intent);
                    MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity_chate.this,R.raw.sound_message);
                    mediaPlayer.start();
                    finish();
                } else {
                    Toast.makeText(MainActivity_chate.this, "Enter Your Name", Toast.LENGTH_SHORT).show();
                }
            }
        });
        dialog.show();
    }
}
