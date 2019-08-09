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
	TextView creditos,notase;
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
	  notase=(TextView)findViewById(R.id.promeetSme);
	  reciclemateria=(RecyclerView)findViewById(R.id.recyclerPromedio);
	  reciclemateria.setLayoutManager(new LinearLayoutManager(this));
	  basededatos basede=new basededatos(getApplicationContext());
	  adaptadormateria =new recyprom(basede.obtenermete());
	  int i=0;
	  credit=0;
	  int cedito=0;
	 cantidm bat=new cantidm(getApplicationContext());
	 
	 capmm busca =new capmm();
	  bat.buscadatos(busca,"M");
	  
	  String ttt=busca.getNum();
	  int sum=0;
	   int t1=Integer.parseInt(ttt);
	   double nta=0;
	   int cre=0;
	   double suma=0;
	   double notsw;
	  for(i=0;i<t1;i++){
		  cre=Integer.parseInt(adaptadormateria.promedioLista.get(i).getPromedio());
		  cedito=Integer.parseInt(adaptadormateria.promedioLista.get(i).getPromedio());
		  nta = Double.parseDouble(adaptadormateria.promedioLista.get(i).getPromet());
		  credit=credit+cedito;
		  suma = suma+(nta*cre);
	  }
	  System.out.println(suma);
	  notsw=suma/credit;
	  reciclemateria.setAdapter(adaptadormateria);
	  creditos.setText(""+credit);
	  notase.setText(""+notsw);
  }
  
}
