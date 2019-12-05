package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MangChoi extends AppCompatActivity {


    MediaPlayer mediaPlayer;
    ImageView Play;
    Button Call;
    Button Khangia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mang_choi);


        Call=(Button) findViewById(R.id.btncall);
        Play = (ImageView) findViewById(R.id.imageViewnhac1);
        Khangia = (Button) findViewById(R.id.btn18);
        mediaPlayer = MediaPlayer.create(MangChoi.this,R.raw.aaa);
        mediaPlayer.start();


        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MangChoi.this, com.example.ailatrieuphu.Call.class);
                startActivity(intent);

            }
        });

        Khangia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MangChoi.this, com.example.ailatrieuphu.Khangia.class);
                startActivity(intent);

            }
        });


        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    Play.setImageResource(R.drawable.play);
                }else
                {
                    mediaPlayer.start();
                    Play.setImageResource(R.drawable.pause);
                }
            }
        });

    }
}
