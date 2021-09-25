package com.myduyen.bt_tuan3.Bai2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.myduyen.bt_tuan3.R;

public class MainActivity2_2 extends AppCompatActivity {

    ImageView imgTaulor, imgnhac;
    TextView textview;
    Taylor t;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_2);

        imgTaulor = findViewById(R.id.imageView3);
        imgnhac = findViewById(R.id.imageView6);
        textview = findViewById(R.id.textView);

        Animation xoay = AnimationUtils.loadAnimation(this,R.anim.anim_taylor);
        Animation amnhac = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);

        imgTaulor.startAnimation(xoay);
        imgnhac.startAnimation(amnhac);

        Intent intent = getIntent();
        if (intent != null){
            t = (Taylor) intent.getSerializableExtra("taylor");
            imgTaulor.setImageResource(t.getAnh());
            textview.setText(t.getSong()+"-"+t.getName());

            Fade fade = new Fade();
            View decor = getWindow().getDecorView();
            getWindow().setEnterTransition(fade);
            getWindow().setExitTransition(fade);
        }
    }
}