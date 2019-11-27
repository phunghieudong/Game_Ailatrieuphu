package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MangChoi extends AppCompatActivity {


    Button Call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mang_choi);


         Call=(Button) findViewById(R.id.btncall);


        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MangChoi.this, com.example.ailatrieuphu.Call.class);
                startActivity(intent);

            }
        });
    }
}
