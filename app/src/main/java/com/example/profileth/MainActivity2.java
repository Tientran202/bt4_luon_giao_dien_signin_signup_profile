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
        tendangnhap =(EditText) findViewById(R.id.tepackage com.example.profileth;

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
                matkhau = (EditText) findViewById(R.id.matkhau);
                dangnhap.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity2.this,Profile2Activity.class);
                        if(tendangnhap.getText().toString().equals("") || matkhau.getText().toString().equals("")){
                            Toast.makeText(MainActivity2.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
                        }
                        else
                        if (tendangnhap.getText().toString().equals("tranngoctien") && matkhau.getText().toString().equals("123456789")){
                            Toast.makeText(MainActivity2.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(MainActivity2.this, "Thông tin đăng nhập sai!!", Toast.LENGTH_SHORT).show();
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
        }ndangnhap);
        matkhau = (EditText) findViewById(R.id.matkhau);
        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,Profile2Activity.class);
                if(tendangnhap.getText().toString().equals("") || matkhau.getText().toString().equals("")){
                    Toast.makeText(MainActivity2.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
                }
                else
                    if (tendangnhap.getText().toString().equals("tranngoctien") && matkhau.getText().toString().equals("123456789")){
                    Toast.makeText(MainActivity2.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "Thông tin đăng nhập sai!!", Toast.LENGTH_SHORT).show();
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