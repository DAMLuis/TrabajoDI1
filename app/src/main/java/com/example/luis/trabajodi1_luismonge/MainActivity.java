package com.example.luis.trabajodi1_luismonge;

import android.animation.Animator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_titulo = (TextView) findViewById(R.id.tv_titulo);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/AlfaSlabOne-Regular.ttf");
        tv_titulo.setTypeface(face);

//        Explode explode = new Explode();//transicion
//        explode.setDuration(800); // Duracion
//        getWindow().setExitTransition(explode);

        tv_titulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Animator anima = ViewAnimationUtils.createCircularReveal(view, (int) view.getWidth() / 2, (int) view.getHeight() / 2, 0, 150);
//                anima.start();


                Intent i = new Intent(MainActivity.this,VerPeliculas.class);
                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());


            }
        });


    }
}
