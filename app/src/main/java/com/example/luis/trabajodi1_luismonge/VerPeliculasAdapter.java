package com.example.luis.trabajodi1_luismonge;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class VerPeliculasAdapter extends ArrayAdapter<Pelicula> {
    ArrayList<Pelicula>films;

    VerPeliculasAdapter(Activity context , ArrayList<Pelicula> peliculas){
        super(context, 0, peliculas);
        films=peliculas;
    }



    @NonNull
    @Override
    public View getView(int i, View vista, ViewGroup vistagrupo) {


        if(vista==null){
            Context cnt = vistagrupo.getContext();
            vista=LayoutInflater.from(cnt).inflate(R.layout.activity_ver_peliculas,null);
        }

        final Pelicula mPeli=films.get(i);
        TextView titulo=(TextView)vista.findViewById(R.id.tvTitulo);
        TextView genero=(TextView)vista.findViewById(R.id.tvGenero);
        ImageView imagen =(ImageView)vista.findViewById(R.id.portada);
        ImageView img_genero =(ImageView)vista.findViewById(R.id.img_genero);


        titulo.setText(mPeli.getTitulo());
        genero.setText(mPeli.getGenero());
        imagen.setImageResource(mPeli.getPortada());
        img_genero.setImageResource(mPeli.getImg_genero());


        return vista;

    }

}
