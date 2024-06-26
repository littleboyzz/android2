package com.example.ph37725_dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class manhinh2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);

        Button update = findViewById(R.id.btnupdate);
        Button btndelete = findViewById(R.id.btndelete);
    }
}