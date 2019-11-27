/*package com.example.ailatrieuphu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ailatrieuphu.R;

public class DangKi extends AppCompatActivity {


    Button Huy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);
        AnhXa();
        ControlButton();

    }
    // Làm nút hủy
    private void ControlButton() {
        Huy.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(DangKi.this, android.R.style.Widget_Material_Light);
                builder.setTitle("Bạn có chắc muốn thoát ?");
                builder.setMessage("Hãy Lựa chọn để sát nhận");
                builder.setIcon(android.R.drawable.alert_dark_frame);
                //Lựa chọn có để thoát chương trình
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                });
                //Lựa chọn không thể trở về màng hình đăng nhập
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        });
    }
    private void AnhXa()
    {
        Huy =(Button) findViewById(R.id.btnhuy1);
    }
}
*/