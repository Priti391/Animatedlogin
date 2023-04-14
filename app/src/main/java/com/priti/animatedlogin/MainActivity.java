package com.priti.animatedlogin;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout lyt;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lyt =  findViewById(R.id.layout);
        btn = findViewById(R.id.button);

        AnimationDrawable animationDrawable = ( AnimationDrawable) lyt.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();

    }
}