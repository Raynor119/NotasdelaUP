package com.pixels.cc;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import com.pixels.cc.R;

import java.util.ArrayList;
import java.util.List;

public class mostrar extends Activity {
    private RecyclerView reciclemateria;
    private MostrarMateryReci adaptadormateria,obid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        reciclemateria=(RecyclerView)findViewById(R.id.recyclerMateria);
        reciclemateria.setLayoutManager(new LinearLayoutManager(this));
        
        basededatos basede=new basededatos(getApplicationContext());
        adaptadormateria =new MostrarMateryReci(basede.obtenermete());
       
        adaptadormateria.setOnClickListener(new View.OnClickListener(){
          
          @Override
          public void onClick(View view){
             String mater1;
           
            
           mater1=adaptadormateria.promedioLista.get(reciclemateria.getChildAdapterPosition(view)).getMateria();
 
            Intent intent =new Intent(mostrar.this,vmateri.class);
            intent.putExtra("Materia1",mater1); 
            startActivity(intent);
            finish();
          }
        });
        reciclemateria.setAdapter(adaptadormateria);
            }
}
