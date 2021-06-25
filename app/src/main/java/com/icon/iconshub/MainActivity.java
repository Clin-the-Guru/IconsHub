package com.icon.iconshub;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
   @BindView(R2.id.flipper)
   android.widget.ViewFlipper ViewFlipper;
   ViewFlipper viewFlipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Animation animation_inn= AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation_inn);
        Animation animation_out=AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation_out);
        viewFlipper.setInAnimation(animation_inn);
        viewFlipper.setOutAnimation(animation_out);


        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        viewFlipper.startFlipping();



    }
}