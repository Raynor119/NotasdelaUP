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
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class promed extends Activity {
	TextView creditos;
	private RecyclerView reciclemateria;
	private  recyprom adaptadormateria;
	int credit;
	basededatos Bas;
	promm buscar;
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_promed);
	  Bas = new basededatos(getApplicationContext());
	  buscar = new promm();
	  creditos=(TextView)findViewById(R.id.credinmt);
	  reciclemateria=(RecyclerView)findViewById(R.id.recyclerPromedio);
	  reciclemateria.setLayoutManager(new LinearLayoutManager(this));
	  basededatos basede=new basededatos(getApplicationContext());
	  adaptadormateria =new recyprom(basede.obtenermete());
	  int i=0;
	  credit=0;
	  int cedito;
	 cantidm bat=new cantidm(getApplicationContext());
	 
	 capmm busca =new capmm();
	  bat.buscadatos(busca,"M");
	  
	  String ttt=busca.getNum();
	  
	   int t1=Integer.parseInt(ttt);
	  for(i=0;i<t1;i++){
		  cedito=Integer.parseInt(adaptadormateria.promedioLista.get(i).getPromedio());
		  credit=credit+cedito;
	  }
	  
	  reciclemateria.setAdapter(adaptadormateria);
	  creditos.setText(""+credit);
  }
  
}
