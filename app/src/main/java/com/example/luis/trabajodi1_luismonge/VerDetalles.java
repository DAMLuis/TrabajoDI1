package com.example.luis.trabajodi1_luismonge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;


public class VerDetalles extends AppCompatActivity {
    ArrayList<DetallesPelicula>detalles;
    private Context mContext;
    private Activity mActivity;
    private CoordinatorLayout mCLayout;
    private Toolbar mToolbar;
    private CollapsingToolbarLayout mCToolbarLayout;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esqueleto_detalles);

        mContext = getApplicationContext();
        mActivity = VerDetalles.this;

        mCLayout = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
        mCToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        mLayoutManager = new GridLayoutManager(mContext,1);
        mRecyclerView.setLayoutManager(mLayoutManager);


        //nposicion del mLisview
        Intent in = getIntent();
        Bundle b = in.getExtras();
        int pos = b.getInt("pos");


        //datos detalles
        ArrayList<DetallesPelicula> detalles= new ArrayList<>();
        detalles.add(new DetallesPelicula("Animales Fantasticos","Fantastico | Accion","Sipsosis:  Año 1926. Newt Scamander acaba de completar un viaje por todo el mundo para encontrar y documentar una extraordinaria selección de criaturas mágicas. Llegando a Nueva York para hacer una breve parada en su camino, donde podría haber llegado y salido sin incidentes…pero no para un Muggle llamado Jacob, un caso perdido de magia, y la fuga de algunas criaturas fantásticas de Newt, que podrían causar problemas el mundo mágico y en el mundo Muggle. ", "Reparto:  Eddie Redmayne, Katherine Waterston, Dan Fogler, Alison Sudol, Colin Farrell, Carmen Ejogo, Samantha Morton, Ezra Miller, Ron Perlman, Johnny Depp, Zoë Kravitz, Gemma Chan, Jon Voight, Christine Marzano, Lucie Pohl ",R.raw.animales,R.drawable.animales));
        detalles.add(new DetallesPelicula("Escuadrón suicida ","Thriller | Fantástico |Acción","Sipnosis: Mientras el gobierno de EE.UU no tiene claro cómo responder a una visita alienígena a la Tierra con intenciones malignas, Amanda 'El Muro' Waller (Viola Davis), la líder de la agencia secreta A.R.G.U.S., ofrece una curiosa solución: reclutar a los villanos más crueles, con habilidades letales e incluso mágicas, para que trabajen para ellos. Sin demasiadas opciones a dar una negativa, los ocho supervillanos más peligrosos del mundo acceden a colaborar con el Ejecutivo en peligrosas misiones secretas, casi suicidas, para así lograr limpiar su expediente.  ", "Reparto:  Will Smith, Margot Robbie, Joel Kinnaman, Viola Davis, Jai Courtney, Jared Leto, Cara Delevingne, Adewale Akinnuoye-Agbaje, Jay Hernandez, Karen Fukuhara, Adam Beach, Scott Eastwood, Jim Parrack, Ike Barinholtz, Common, Ben Affleck ",R.raw.escuadron,R.drawable.escuadron));
        detalles.add(new DetallesPelicula("Aliados","Thriller | Drama | Romance","Sipnosis: Año 1942 durante la Segunda Guerra Mundial. Max (Brad Pitt) es un espía del bando aliado que se enamora de Marianne (Marion Cotillard), una compañera francesa, tras una peligrosa misión en el norte de África. La pareja comienza una relación amorosa hasta que a él le notifican que Marianne puede que sea una agente doble que trabaja para los nazis. "  , " Reparto: Brad Pitt, Marion Cotillard, Jared Harris, Daniel Betts, Lizzy Caplan, August Diehl, Simon McBurney, Thierry Frémont, Matthew Goode, Anton Lesser, Marion Bailey, Camille Cottin, Charlotte Hope ",R.raw.aliados ,R.drawable.aliados));
        detalles.add(new DetallesPelicula("Inferno","Thriller | Intriga" ,"Sipnosis: Robert Langdon, el famoso profesor de simbología (nuevamente interpretado por Tom Hanks) se encuentra tras el rastro de una serie de pistas conectadas con el mismísimo Dante. Cuando Langdon despierta con amnesia en un hospital italiano, hará equipo con Sienna Brooks (Felicity Jones), una doctora de la que él espera le ayude a recuperar sus recuerdos. Juntos recorrerán Europa en una carrera a contrarreloj para desbaratar una letal conspiración global. Adaptación del best-seller homónimo de Dan Brown.  " , "Reparto: Tom Hanks, Felicity Jones, Ben Foster, Irrfan Khan, Omar Sy, Sidse Babett Knudsen, Ana Ularu, Jon Donahue, Cesare Cremonini, Xavier Laurent, Fausto Maria Sciarappa, Juan Ignacio Pita  " , R.raw.inferno, R.drawable.inferno ));
        detalles.add(new DetallesPelicula("Un monstruo viene a verme","Fantástico | Drama", "Sipnosis: Tras la separación de sus padres, Connor (Lewis MacDougall), un chico de 12 años, tendrá que ocuparse de llevar las riendas de la casa, pues su madre (Felicity Jones) está enferma de cáncer. Así las cosas, el niño intentará superar sus miedos y fobias con la ayuda de un monstruo (Liam Neeson), pero sus fantasías tendrán que enfrentarse no sólo con la realidad, sino con su fría y calculadora abuela (Sigourney Weaver). Con este nuevo trabajo J.A. Bayona cierra su trilogía sobre las relaciones maternofiliales, que inició con \"El orfanato\" y continuó con \"Lo imposible\". " , "Reparto: Lewis MacDougall, Sigourney Weaver, Felicity Jones, Liam Neeson, Toby Kebbell, Geraldine Chaplin, James Melville, Garry Marriott, Joe Curtis, Kai Arnthal, Max Gabbay ", R.raw.unmostruo, R.drawable.mostruo));
        detalles.add(new DetallesPelicula("Assassin's Creed ", "Aventuras | Acción | Ciencia ficción " , "Sipnosis: Gracias a una tecnología revolucionaria que permite el acceso a los recuerdos genéticos, Callum Lynch (Michael Fassbender) revive las aventuras de Aguilar, un antepasado suyo que vivió en la España del siglo XV. Así descubre que es descendiente de una misteriosa organización secreta, los Asesinos, y que posee las habilidades y los conocimientos necesarios para enfrentarse a la poderosa y temible organización de los Templarios en la época actual. Adaptación libre del videojuego homónimo.  ", "Reparto: Michael Fassbender, Marion Cotillard, Ariane Labed, Jeremy Irons, Brendan Gleeson, Michael Kenneth Williams, Charlotte Rampling, Brian Gleeson, Carlos Bardem, Hovik Keuchkerian, Matias Varela, Denis Ménochet, Mohammed Ali, Javier Gutiérrez, Dino Fazzani, Gabriel Andreu, Megan Affonso " , R.raw.assasin, R.drawable.assassin ));

        //elige segun posicion
        ArrayList<DetallesPelicula>detalles2 = new ArrayList<>();
        detalles2.add(detalles.get(pos));

        //video en toolbar
        VideoView video =(VideoView)findViewById(R.id.trailer);
        Uri path = Uri.parse("android.resource://com.example.luis.trabajodi1_luismonge/" + detalles.get(pos).getVideo());
        video.setVideoURI(path);
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();

        ////full screen
        if(getOrientation()==1){
            String url = "android.resource://com.example.luis.trabajodi1_luismonge/" + detalles.get(pos).getVideo();
            Intent i = new Intent(VerDetalles.this, VideoPlayer.class);
            Bundle bu = new Bundle();
            bu.putString("url", url);
            i.putExtras(bu);
            startActivity(i);
        }


        //toolbar titulo
        mCToolbarLayout.setTitle(detalles.get(pos).getTitulo());
        mCToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        mCToolbarLayout.setExpandedTitleColor(Color.WHITE);


        try{
            getSupportActionBar().hide();
        }catch(NullPointerException ex){
            ex.getStackTrace();
        }


        //llama RecycleAdapter enviar arraylist
        mAdapter = new RecycleAdapter(mContext, detalles2);

        // Data bind RecyclerView with Adapter
        mRecyclerView.setAdapter(mAdapter);





    }

    public void atras(View v){
        finish();
    }

    public int getOrientation(){
        if(getResources().getDisplayMetrics().widthPixels>getResources().getDisplayMetrics().heightPixels) {
            return 1;
        }
        else{
            return 2;
        }
    }
}
