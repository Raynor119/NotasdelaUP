package com.pixels.cc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.content.IntentSender;
import android.widget.Toast;
import com.pixels.cc.R;


public class primercorte extends Activity {
  String mat; EditText nota15,nota20; TextView rest;
  basededatos Bas;
  promm buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primercorte);
        Bundle extreras = getIntent().getExtras();
        mat = extreras.getString("Mate1");
        
        Bas = new basededatos(getApplicationContext());
        buscar = new promm();
        nota15 = (EditText) findViewById(R.id.editn15);
        nota20 = (EditText) findViewById(R.id.editn20);
        rest = (TextView) findViewById(R.id.textnota);
  
    }
    public void scarn(View v){
		Bundle extreras = getIntent().getExtras();
		String veri=extreras.getString("veri");
   if(veri.equals("0")){
   
   
      String aux1 = String.valueOf(nota15.getText().toString());
      String aux2 = String.valueOf(nota20.getText().toString());
        if ((aux1.equals("")) && (aux2.equals(""))) {


                }
                else
                {
                    if ((aux1.equals("")) || (aux2.equals(""))) {


                    }
                    else
                    {

                        float a = Float.parseFloat(aux1);
                        float b = Float.parseFloat(aux2);
                        Bas.buscardatos(buscar,mat);
                        double resultado2 = ((a * 0.15) + (b * 0.20)) / 0.35;
                        double promedio2 = ((a * 0.15) + (b * 0.20));
                        float resultado1 = Float.parseFloat(String.valueOf(resultado2));
                        float promedio1 = Float.parseFloat(String.valueOf(promedio2));
                        String resultado = String.valueOf(resultado1);
                        String promedio = String.valueOf(promedio1);
                         rest.setText(""+resultado);
                        String cret=buscar.getPromedio();
                        String segun=buscar.getSegundo();
                        String terce=buscar.getTercer();
                        String prom=promedio;
                      Bas.primerNot(mat,cret,resultado,segun,terce,prom);
       Toast.makeText(getApplicationContext(), "Nota Guardada", Toast.LENGTH_LONG).show();
                    }

      
      
      
      
      }
	 
    }
	else{
	
	
	 
	String aux1 = String.valueOf(nota15.getText().toString());
      String aux2 = String.valueOf(nota20.getText().toString());
        if ((aux1.equals("")) && (aux2.equals(""))) {


                }
                else
                {
                    if ((aux1.equals("")) || (aux2.equals(""))) {


                    }
                    else
                    {

                        float a = Float.parseFloat(aux1);
                        float b = Float.parseFloat(aux2);
                        Bas.buscardatos(buscar,mat);
                        double resultado2 = ((a * 0.15) + (b * 0.20)) / 0.35;
                        double promedio2 = ((a * 0.15) + (b * 0.20));
                        float resultado1 = Float.parseFloat(String.valueOf(resultado2));
                        float promedio1 = Float.parseFloat(String.valueOf(promedio2));
                        
                        String primt=buscar.getPrimer();
                        float prin=Float.parseFloat(primt);
                        String pron=buscar.getPromet();
						double pron1=Double.parseDouble(pron);
						double tt=pron1/0.35;
						float prin1=Float.parseFloat(String.valueOf(tt));
						float promm1=prin1-prin;
						double promm2=promm1*0.35;
						float promt=Float.parseFloat(String.valueOf(promm2));
						float promediot=promt+promedio1;
                        String resultado = String.valueOf(resultado1);
                        String promedio = String.valueOf(promediot);
                         rest.setText(""+resultado);
                        String cret=buscar.getPromedio();
                        String segun=buscar.getSegundo();
                        String terce=buscar.getTercer();
                        String prom=promedio;
                      Bas.primerNot(mat,cret,resultado,segun,terce,prom);
						Toast.makeText(getApplicationContext(), "Nota Modificada", Toast.LENGTH_LONG).show();
						
                    }

      
      
      
      
      }
      }
 }
	
  
  public void bott(View v){
    Intent intent =new Intent(primercorte.this,vmateri.class);
             intent.putExtra("Materia1",mat);
            startActivity(intent);
            finish();
  }
}
