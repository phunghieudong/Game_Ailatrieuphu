package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.ailatrieuphu.MainActivity;
import com.example.ailatrieuphu.R;

import java.util.ArrayList;

public class Call extends AppCompatActivity {

    GridView gvHinhAnh;
    ArrayList<HinhAnh> arrayImage;
    HinhAnhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        AnhXa();
        adapter = new HinhAnhAdapter(this,R.layout.dong_hinh_anh,arrayImage);
        gvHinhAnh.setAdapter(adapter);

        gvHinhAnh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                Toast.makeText(Call.this,arrayImage.get(i).getTen(),Toast.LENGTH_LONG).show();
            }
        });

    }

    private void AnhXa() {

        gvHinhAnh = (GridView) findViewById(R.id.gridviewhinhanh);
        arrayImage = new ArrayList<>();
        arrayImage.add(new HinhAnh("Lù chọn A nha",R.drawable.u1));
        arrayImage.add(new HinhAnh("Rô chọn C nha",R.drawable.u2));
        arrayImage.add(new HinhAnh("Ku chọn A nha nha",R.drawable.u3));
        arrayImage.add(new HinhAnh("Nghe tao đi , tao chọn D",R.drawable.u4));
        arrayImage.add(new HinhAnh("Dần chọn C ",R.drawable.u5));
        arrayImage.add(new HinhAnh("Em chọn A <3",R.drawable.u6));
        arrayImage.add(new HinhAnh("Bảnh tin là câu D",R.drawable.u7));
        arrayImage.add(new HinhAnh("Mon chọn B",R.drawable.u8));
        arrayImage.add(new HinhAnh("Bé Sa chọn D",R.drawable.u9));



    }
}

