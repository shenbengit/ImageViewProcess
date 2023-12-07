package com.example.imageviewprocess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colorfilter);

        findViewById(R.id.bt_lighting).setOnClickListener(this);
        findViewById(R.id.bt_porterduff).setOnClickListener(this);
        findViewById(R.id.bt_colormatrix).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_lighting) {
            Intent intent = new Intent(this, LightingActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_porterduff) {
            Intent intent = new Intent(this, PorterDuffActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_colormatrix) {
            Intent intent = new Intent(this, ColorMatrixActivity.class);
            startActivity(intent);
        }
    }
}