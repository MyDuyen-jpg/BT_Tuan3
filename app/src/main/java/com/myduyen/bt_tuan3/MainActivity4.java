package com.myduyen.bt_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        findViewById(R.id.button_back4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity4.super.onBackPressed();
            }
        });
    }
}