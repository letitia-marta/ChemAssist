package com.example.chemassist;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class DemoActivity extends AppCompatActivity
{
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        VideoView videoView = findViewById(R.id.demo);

        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.demo);
        videoView.setVideoURI(videoUri);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
