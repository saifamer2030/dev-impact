package com.mohamedbogdady.saifa1992199120005517891475666.mb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.mohamedbogdady.saifa1992199120005517891475666.mb.ChatRoom.MainActivity_chate;

public class CV extends AppCompatActivity {
    long time;
    ImageButton imageButton, imageButton2, imagephon, imageButton3, imageButton4, imageButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imagephon = (ImageButton) findViewById(R.id.imagephon);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);


    }

    @Override
    public void onBackPressed() {


        if (time + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Toast.makeText(CV.this, "Press Again To Exit", Toast.LENGTH_SHORT).show();
        }
        time = System.currentTimeMillis();

    }

    public void posts(View view) {
        Intent intent = new Intent(CV.this, ImageActivity.class);
        startActivity(intent);
    }

    public void phone(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+966591634383"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void facebook(View view) {
        Intent website = new Intent(Intent.ACTION_VIEW);
        website.setData(Uri.parse("https://www.facebook.com/Mohamed.elaraby111"));
        if (website.resolveActivity(getPackageManager()) != null) {
            startActivity(website);
        }
    }

    public void linkedin(View view) {

        Intent intent1 = new Intent(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse("https://www.linkedin.com/in/mohamed-elboghdady-45a879136"));
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }

    public void twetter(View view) {
        Intent intent1 = new Intent(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse("https://twitter.com/DESIGNEREGY?s=09"));
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }

    }

    public void chat(View view) {
        Intent intent = new Intent(CV.this, MainActivity_chate.class);
        startActivity(intent);
    }
}

     /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    Intent sendemail = new Intent(Intent.ACTION_SEND);
                    sendemail.setData(Uri.parse("mailto:Elboghdady38@gmail.com"));
                    sendemail.setType("message/rfc822");
                    sendemail.putExtra(Intent.EXTRA_EMAIL, "Elboghdady38@gmail.com");
                    sendemail.putExtra(Intent.EXTRA_STREAM, "Hello interested in your work");
                    sendemail.putExtra(Intent.EXTRA_TEXT, "Contact me via this email");

                    startActivity(sendemail);
                } catch (Exception e) {
                    Toast.makeText(CV.this, "Sorry there is no e-mail application", Toast.LENGTH_LONG).show();
                }
            }
        });


        setSupportActionBar(toolbar);

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab_2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+966591634383"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }
    @Override
    public void onBackPressed() {


        if (time + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
        }else {
            Toast.makeText(CV.this,"Press Again To Exit",Toast.LENGTH_SHORT).show();
        }
        time = System.currentTimeMillis();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cv, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                Toast.makeText(this, "Good Luck", Toast.LENGTH_LONG).show();

                finish();

                return true;

            case R.id.facbook:
                Intent website = new Intent(Intent.ACTION_VIEW);
                website.setData(Uri.parse("https://www.facebook.com/Mohamed.elaraby111"));
                if (website.resolveActivity(getPackageManager()) != null) {
                    startActivity(website);
                }

                return true;
            case R.id.behance:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.behance.net/mohamedelboghdady"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);

                    return true;
                }
            case R.id.insta:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.instagram.com/graphics__designer__/"));
                if (intent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);

                    return true;
                }
                return true;
        }
        return true;
    }

    public void desinger(View view) {
        Intent intent = new Intent(this,ImageActivity.class);
        startActivity(intent);
    }

   public void edit(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }*/


