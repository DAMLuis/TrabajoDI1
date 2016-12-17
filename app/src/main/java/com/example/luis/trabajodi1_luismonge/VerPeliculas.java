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

        peliculas.add(new Pelicula("Titulo: Animales Fantasticos","Genero: Fantastico/Accion",R.drawable.animales,true));
        peliculas.add(new Pelicula("Titulo: Escuadrón suicida ","Genero: Thriller | Fantástico |Acción",R.drawable.escuadron,false));
        peliculas.add(new Pelicula("Titulo: Aliados","Genero: Thriller | Drama | Romance ",R.drawable.aliados,true));
        peliculas.add(new Pelicula("Titulo: Inferno","Genero: Thriller | Intriga",R.drawable.inferno,false));
        peliculas.add(new Pelicula("Titulo: Un monstruo viene a verme" ,"Genero: Fantástico | Drama",R.drawable.mostruo,true));
        peliculas.add(new Pelicula("Titulo: Assassin's Creed ", "Genero: Aventuras | Acción | Ciencia ficción " ,R.drawable.assassin,true));


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
