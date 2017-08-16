package com.example.captain_n3mo.blurry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonVolumeIn(View view) {
        startActivity(new Intent(MainActivity.this, VolumeIn.class));
    }

    public void buttonVolumeOut(View view) {
        startActivity(new Intent(MainActivity.this, VolumeOut.class));
    }

    public void buttonCalculate(View view) {
        startActivity(new Intent(MainActivity.this, Calculate.class));
    }
}
