package com.example.a2050531200246_doanthaiphien_baikt3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailTacgia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tacgia);

        TextView textViewten = (TextView)findViewById(R.id.tenDS);
        TextView textViewmota = (TextView) findViewById(R.id.motaDS);
        Intent intent= getIntent();
        textViewten.setText(intent.getStringExtra("Ten"));
        textViewmota.setText(intent.getStringExtra("MoTa"));

    }
}