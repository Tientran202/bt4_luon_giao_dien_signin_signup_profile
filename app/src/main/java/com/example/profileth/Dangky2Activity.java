package com.example.profileth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Dangky2Activity extends AppCompatActivity {
    TextView dacotaikhoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangky2);
        dacotaikhoan = (TextView) findViewById(R.id.dacotaikhoan);
        dacotaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dangky2Activity.this,MainActivity2.class);
                startActivity(i);
            }
        });

    }
}