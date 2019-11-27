package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QuanLy extends AppCompatActivity {

    Button Load , Take , List;
    TextView PhungHieuDong;
    ImageView Meo;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    static final int SELECE_A_PHOTO =2;
    String currentPhotoPath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly);

        Load=(Button) findViewById(R.id.btnload);
        Take=(Button) findViewById(R.id.btntake);
        List=(Button) findViewById(R.id.btnlist);


        PhungHieuDong = (TextView) findViewById(R.id.txtanhdaidien);
        Meo = (ImageView) findViewById(R.id.imaanhdaidien);

        Load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i =new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
               startActivityForResult(i,SELECE_A_PHOTO);
            }
        });


// Nó la cai su kien chup hinh a
        Take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchTakePictureIntent();
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            Meo.setImageBitmap(imageBitmap);
        }
    }


    // Phan chup hinh ne
    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }


}