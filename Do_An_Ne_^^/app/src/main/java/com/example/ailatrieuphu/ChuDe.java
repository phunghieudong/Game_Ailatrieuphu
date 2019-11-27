package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChuDe extends AppCompatActivity {


    Button KhoaHoc,LichSu,TheThao,VanHoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chu_de);


        //Anh xa

        KhoaHoc = (Button) findViewById(R.id.btnkhoahoc);
        VanHoa = (Button) findViewById(R.id.btnvanhoa);
        TheThao = (Button) findViewById(R.id.btnthethao);
        LichSu = (Button) findViewById(R.id.btnlichsu);



        KhoaHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChuDe.this, com.example.ailatrieuphu.MangChoi.class);
                startActivity(intent);

            }
        });

        VanHoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChuDe.this, com.example.ailatrieuphu.MangChoi.class);
                startActivity(intent);

            }
        });


        TheThao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChuDe.this, com.example.ailatrieuphu.MangChoi.class);
                startActivity(intent);

            }
        });

        LichSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChuDe.this, com.example.ailatrieuphu.MangChoi.class);
                startActivity(intent);

            }
        });
    }



}
