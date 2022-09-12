package com.example.profileth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {
    Button dangnhap;
    TextView dangky;
    EditText tendangnhap, matkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dangnhap = (Button) findViewById(R.id.dangnhap);
        dangky =(TextView) findViewById(R.id.dangky);
        tendangnhap =(EditText) findViewById(R.id.tendangnhap);
        dangky = (EditText) findViewById(R.id.matkhau);
        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,Profile2Activity.class);
                if(tendangnhap.getText().toString().trim().isEmpty()||matkhau.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity2.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
                }
                else
                    if (tendangnhap.getText().toString()=="tranngoctien" && matkhau.getText().toString()=="123456789"){
                    Toast.makeText(MainActivity2.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                }


            }
        });
        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity2.this,Dangky2Activity.class);


                startActivity(in);
            }
        });
    }
}