package com.example.youtubeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Button btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        Button btnPlayPlaylist = (Button) findViewById(R.id.btnPlayPlaylist);

        btnPlayVideo.setOnClickListener(this);
        btnPlayPlaylist.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null ;

        switch (view.getId()){
            case R.id.btnPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_VIDEO_ID);
                break;
            case R.id.btnPlayPlaylist:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this,YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST_ID);
                break;
            default:

        }
        if(intent!= null){
            startActivity(intent);
        }
    }
}
