package com.example.luis.trabajodi1_luismonge;

import android.animation.Animator;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class VerPeliculas extends AppCompatActivity {
    ArrayList<Pelicula>peliculas;
    VerPeliculasAdapter adapter;
    ListView listView;
    int pos=0;
    boolean pulsado=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esqueleto_ver_pelis);


        peliculas= new ArrayList<>();

        peliculas.add(new Pelicula("Animales Fantasticos","Fantastico/Accion",R.drawable.animales,R.drawable.fantasy));
        peliculas.add(new Pelicula("Escuadrón suicida ","Thriller | Fantástico |Acción",R.drawable.escuadron,R.drawable.cienciaficcion));
        peliculas.add(new Pelicula("Aliados","Thriller | Drama | Romance ",R.drawable.aliados,R.drawable.thriller));
        peliculas.add(new Pelicula("Inferno","Thriller | Intriga",R.drawable.inferno,R.drawable.thriller));
        peliculas.add(new Pelicula("Un monstruo viene a verme" ,"Fantástico | Drama",R.drawable.mostruo,R.drawable.fantasy));
        peliculas.add(new Pelicula("Assassin's Creed ", " Aventuras | Acción | Ciencia ficción " ,R.drawable.assassin,R.drawable.aventuras));


        adapter = new VerPeliculasAdapter(this, peliculas);
        listView = (ListView) findViewById(R.id.mListView);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    for (int j = 0; j <= peliculas.size(); j++) {
                            if (position==j){
                                pos = position;
                                Intent i = new Intent(VerPeliculas.this, VerDetalles.class);
                                Bundle b = new Bundle();
                                b.putInt("pos", pos);
                                i.putExtras(b);
                                startActivity(i);
                                break;
                            }


                    }

            }
        });







    }


}
