package com.example.bookworm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
    private  static int Splash_timeout=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= findViewById(R.id.textView);
        t2 = findViewById(R.id.textView1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },Splash_timeout);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation);
        t1.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation1);
        t2.startAnimation(animation1);



    }
}