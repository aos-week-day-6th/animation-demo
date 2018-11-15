package com.example.admin.tweenadnimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);

    }

    void onFadeInClicked(View view){
        Animation animation=AnimationUtils
                .loadAnimation(this,R.anim.fade_in);
        imageView.startAnimation(animation);
    }

    void onFadeOutClicked(View view){
        Animation animation=AnimationUtils
                .loadAnimation(this,R.anim.fade_out);
        imageView.startAnimation(animation);
    }

    void onZoomInClicked(View view){
        Animation animation=AnimationUtils
                .loadAnimation(this,R.anim.zoom_in);
        imageView.startAnimation(animation);
    }
    void onZoomOutClicked(View view){
        Animation animation=AnimationUtils
                .loadAnimation(this,R.anim.zoom_out);
        imageView.startAnimation(animation);
    }

    void onRotateClicked(View v){
        imageView.startAnimation(
                AnimationUtils.loadAnimation(
                        this,R.anim.rotate_anim
                )
        );
    }
    void onMoveClicked(View v){
        imageView.startAnimation(
                AnimationUtils.loadAnimation(
                        this,R.anim.move_anim
                )
        );
    }
}
