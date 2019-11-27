package com.example.ailatrieuphu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangNhap extends AppCompatActivity {
    Button ChoiLuon, LuatChoi,MuaCredit ,LichSu,quanlyne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);


        MuaCredit=(Button) findViewById(R.id.btnmuacredit1);
        ChoiLuon = (Button) findViewById(R.id.btndangki1);
        LuatChoi = (Button) findViewById(R.id.btnluatchoi1);
        LichSu = (Button) findViewById(R.id.btnlichsu);
        quanlyne = (Button) findViewById(R.id.btnhuy1);

        ControlButton();
        MuaCredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangNhap.this, com.example.ailatrieuphu.MuaCredit.class);
                startActivity(intent);

            }
        });
        LichSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangNhap.this, com.example.ailatrieuphu.XepHang.class);
                startActivity(intent);

            }
        });


        ChoiLuon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangNhap.this, com.example.ailatrieuphu.ChuDe.class);
                startActivity(intent);

            }
        });

        quanlyne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangNhap.this, com.example.ailatrieuphu.QuanLy.class);
                startActivity(intent);

            }
        });




    }

    private void ControlButton() {
        LuatChoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DangNhap.this, android.R.style.Widget_Material_Light);
                builder.setTitle("Đây là luật chơi , bạn hãy xem kĩ nhé");
                builder.setMessage("Bạn sẽ trả lời 15 câu hỏi của chương trình ,Có 3 mốc quan trọng mà bạn phải vượt qua là 5 , 10 và 15 ,Bạn có 4 quyền trợ giúp là 50/50 , Đổi câu hỏi , hỏi ý kiến khán giả , và gọi điện cho chuyên gia.Bạn đã hiểu rõ luật chơi ?Bấm không để tiếp tục chi , và Có nếu bạn muốn dừng lại ngay bây giờ  Chúc bạn may mắn lần sau ^^ ");
                builder.setIcon(android.R.drawable.alert_dark_frame);
                //Lựa chọn có để thoát chương trình
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                });

                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        });
    }
}