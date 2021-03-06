package com.example.luis.trabajodi1_luismonge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;


public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<DetallesPelicula>  mDataSet;


    public RecycleAdapter(Context context, ArrayList<DetallesPelicula> list){
        mContext = context;
        mDataSet=list;
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        public LinearLayout mDetalles;
        TextView titulo;
        TextView genero;
        TextView sipsosis;
        TextView reparto;
        ImageView imagen;
        LinearLayout masInfo;
        TextView tv_masInfo;
        boolean isImageFitToScreen;

        public ViewHolder(View v){
            super(v);

            // Get the widget reference from the custom layout
            mDetalles = (LinearLayout) v.findViewById(R.id.mDetalles);
            titulo=(TextView)v.findViewById(R.id.tvd_titulo);
            genero=(TextView)v.findViewById(R.id.tvd_genero);
            sipsosis=(TextView)v.findViewById(R.id.tvd_sipnonis);
            reparto=(TextView)v.findViewById(R.id.tvd_reparto);
            imagen =(ImageView)v.findViewById(R.id.portada);

            masInfo=(LinearLayout)v.findViewById(R.id.verMasInfo);
            tv_masInfo=(TextView)v.findViewById(R.id.tv_masInfo);


            //ver portada a fullscreen
            imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isImageFitToScreen) {
                        isImageFitToScreen=false;
                        imagen.setLayoutParams(new LinearLayout.LayoutParams( LinearLayout.LayoutParams.WRAP_CONTENT, 230));
                        imagen.setAdjustViewBounds(true);
                    }else{
                        isImageFitToScreen=true;
                        imagen.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                        imagen.setScaleType(ImageView.ScaleType.FIT_XY);
                    }
                }
            });


            //mas informacion mostrar todoel texto
            tv_masInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ViewGroup.LayoutParams params = masInfo.getLayoutParams();
                    params.height = 900;
                    masInfo.setLayoutParams(params);
                    tv_masInfo.setVisibility(View.INVISIBLE);
                }
            });




        }
    }

    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(mContext).inflate(R.layout.ver_detalles1,parent,false);


        ViewHolder vh = new ViewHolder(v);

        // Return the ViewHolder
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        // Get the current animal from the data set
        DetallesPelicula deta = mDataSet.get(position);


        // Set the TextView widgets text
        holder.titulo.setText(deta.getTitulo());
        holder.genero.setText(deta.getGenero());
        holder.sipsosis.setText(deta.getDescripcion());
        holder.reparto.setText(deta.getReparto());
        holder.imagen.setImageResource(deta.getPortada());



    }

    @Override
    public int getItemCount(){
        // Count the items
        return mDataSet.size();
    }




}