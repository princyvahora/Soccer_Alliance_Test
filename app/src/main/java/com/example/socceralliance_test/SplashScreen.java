package com.example.socceralliance_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

   // private static int SPLASH_SCREEN = 5000;

private ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        logo = (ImageView)findViewById(R.id.logo);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transition);
        logo.startAnimation(myanim);

        //new Handler().postDelayed(new Runnable() {
          //  @Override
            //public void run() {
              //  Intent intent = new Intent(SplashScreen.this,LoginScreen.class);
                //startActivity(intent);
                //finish();

          //  }
      //  },SPLASH_SCREEN);


    }

}
