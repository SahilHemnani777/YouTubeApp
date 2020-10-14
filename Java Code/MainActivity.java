package com.example.youtubeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPlaySingleVideo = (Button) findViewById(R.id.btnPlaySingleVideo);
        Button btnStandaloneSubMenu = (Button) findViewById(R.id.btnStandAloneSubMenu);
        btnPlaySingleVideo.setOnClickListener(this);
        btnStandaloneSubMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=null;

        switch (view.getId()){
            case R.id.btnPlaySingleVideo:
                intent =new Intent(this, YoutubeActivity.class);
                break;
            case R.id.btnStandAloneSubMenu:
                intent = new Intent(this,StandaloneActivity.class);
                break;
            default:

        }

        if( intent!= null){
            startActivity(intent);
        }
    }
}