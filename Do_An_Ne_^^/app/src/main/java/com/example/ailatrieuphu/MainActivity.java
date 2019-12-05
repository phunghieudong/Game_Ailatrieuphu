package com.example.ailatrieuphu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Khai báo
    EditText TaiKhoan, MatKhau;
    Button DangNhap,DangKi,Quen,Huy;
    String ten,mk;
    MediaPlayer mediaPlayer;
    ImageView play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        ControlButton();


        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.tttt);
        mediaPlayer.start();

    }

    // nhac
    //Làm nút hủy
    private void ControlButton() {
        Huy.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,android.R.style.Widget_Material_Light);
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

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play.setImageResource(R.drawable.play);
                }else
                {
                    mediaPlayer.start();
                    play.setImageResource(R.drawable.pause);
                }
            }
        });
        // Cái này để chuyển qua cái trang đăng kí nè
        DangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("Hộp thoại xử lý");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.customdialog);
                final EditText edttk = (EditText)dialog.findViewById(R.id.edttk);
                final EditText edtmk = (EditText)dialog.findViewById(R.id.edtmk);
                Button btnhuy = (Button)dialog.findViewById(R.id.buttonhuy);
                Button btndongy = (Button)dialog.findViewById(R.id.buttondongy);
                btndongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ten = edttk.getText().toString().trim();
                        mk = edtmk.getText().toString().trim();



                        TaiKhoan.setText(ten);
                        MatKhau.setText(mk);

                        dialog.cancel();
                    }
                });
                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
              dialog.show();

            }
        });
        // Cái này để chuyển qua cái trang đăng nhập nè nè
      DangNhap.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(TaiKhoan.getText().length()!=0 && MatKhau.getText().length() !=0)
              {
                  if(TaiKhoan.getText().toString().equals(ten) &&  MatKhau.getText().toString().equals(mk) )
                  {
                      Toast.makeText(MainActivity.this,"Bạn đã đăng nhập thành công ",Toast.LENGTH_LONG).show();
                      Intent intent = new Intent(MainActivity.this,DangNhap.class);
                       startActivity(intent);

                  }else if(TaiKhoan.getText().toString().equals("dong") && MatKhau.getText().toString().equals("123"))
                  {
                      Toast.makeText(MainActivity.this,"Bạn đã đăng nhập thành công ",Toast.LENGTH_LONG).show();
                      Intent intent = new Intent(MainActivity.this,DangNhap.class);
                      startActivity(intent);
                  }else
                  {
                      Toast.makeText(MainActivity.this,"Bạn đã đăng nhập thất bại ",Toast.LENGTH_LONG).show();
                  }

              }else
              {
                  Toast.makeText(MainActivity.this,"Mời bạn nhập đủ thông tin ",Toast.LENGTH_LONG).show();
              }
          }
      });

    }
    private void AnhXa()
    {
        TaiKhoan = (EditText) findViewById(R.id.edttaikhoan1);
        MatKhau = (EditText) findViewById(R.id.edtmatkhau1);
        DangNhap =(Button) findViewById(R.id.btndangnhap1);
        DangKi =(Button) findViewById(R.id.btndangki1);
        Quen =(Button) findViewById(R.id.btndangnhap1);
        Huy =(Button) findViewById(R.id.btnhuy1);
        play = (ImageView) findViewById(R.id.imageViewplay);

    }
}
