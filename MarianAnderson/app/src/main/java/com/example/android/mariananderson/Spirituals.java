package com.example.android.mariananderson;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

import static com.example.android.mariananderson.R.id.avemaria;
import static com.example.android.mariananderson.R.id.spirituals;

public class Spirituals extends AppCompatActivity  {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ImageView play = (ImageView) findViewById(R.id.avemaria);

        setContentView(R.layout.activity_spirituals);
        mediaPlayer = MediaPlayer.create(this, R.raw.avemaria);

        // Find the View that shows the Ave Maria View

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the AveMaria View is clicked on.
            @Override
            public void onClick(View view) {

                Toast.makeText(this, "Playing sound",Toast.LENGTH_SHORT).show();
                        mediaPlayer.start();
            }
        })
            }
        }

