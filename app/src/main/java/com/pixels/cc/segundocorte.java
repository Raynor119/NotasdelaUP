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

public class segundocorte extends Activity {
  String mat; EditText nota151,nota201; TextView rest;
  basededatos Bas;
  promm buscar;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundocorte);
        Bundle extreras = getIntent().getExtras();
        mat = extreras.getString("Mate1");
        Bas = new basededatos(getApplicationContext());
        buscar = new promm();
        nota151 = (EditText) findViewById(R.id.editn151);
        nota201 = (EditText) findViewById(R.id.editn201);
        rest = (TextView) findViewById(R.id.textnota);
  
        
      }
      public void scarn1(View v){
        Bas.buscardatos(buscar,mat);
        	Bundle extreras = getIntent().getExtras();
		String veri=extreras.getString("veri");
		if(veri.equals("0")){
      String aux1 = String.valueOf(nota151.getText().toString());
      String aux2 = String.valueOf(nota201.getText().toString());
      
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
                        
                        double resultado2 = ((a * 0.15) + (b * 0.20)) / 0.35;
                        double promedio2 = ((a * 0.15) + (b * 0.20));
                        float resultado1 = Float.parseFloat(String.valueOf(resultado2));
                        float promedio1 = Float.parseFloat(String.valueOf(promedio2));
                        String resultado11 = String.valueOf(resultado1);
                          
						  String promdi1=buscar.getPromet();
						  float tt=Float.parseFloat(String.valueOf(promdi1));
						  float pron1=tt+promedio1;
						String promedio = String.valueOf(pron1);
                         rest.setText(""+resultado11);
                        String cret=buscar.getPromedio();
                        String prime=buscar.getPrimer();
                        
                        String terce=buscar.getTercer();
                      
                       
                      Bas.primerNot(mat,cret,prime,resultado11,terce,promedio);
       Toast.makeText(getApplicationContext(), "Nota Guardada", Toast.LENGTH_LONG).show();
                    }

      
      
       }
    }else
    {
		String aux1 = String.valueOf(nota151.getText().toString());
		String aux2 = String.valueOf(nota201.getText().toString());

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
                String segu=buscar.getSegundo();
				double sge1=Double.parseDouble(segu);
				double t1=sge1*0.35;
				String tq=buscar.getPromet();
				double gt=Double.parseDouble(tq);
				double tt1=gt-t1;
				double resultado2 = ((a * 0.15) + (b * 0.20)) / 0.35;
				double promedio2 = ((a * 0.15) + (b * 0.20));
				float resultado1 = Float.parseFloat(String.valueOf(resultado2));
				float promedio1 = Float.parseFloat(String.valueOf(promedio2));
				String resultado11 = String.valueOf(resultado1);
                float prmm=Float.parseFloat(String.valueOf(tt1));
				float promdit1=prmm+promedio1;
				String promdi1=buscar.getPromet();
				float tt=Float.parseFloat(String.valueOf(promdi1));
				
				String promedio = String.valueOf(promdit1);
				rest.setText(""+resultado11);
				String cret=buscar.getPromedio();
				String prime=buscar.getPrimer();

				String terce=buscar.getTercer();


				Bas.primerNot(mat,cret,prime,resultado11,terce,promedio);
				Toast.makeText(getApplicationContext(), "Nota Modificado", Toast.LENGTH_LONG).show();
				
				
				}
		}
    }
  }
  public void bott1(View v){
    Intent intent =new Intent(segundocorte.this,vmateri.class);
             intent.putExtra("Materia1",mat);
            startActivity(intent);
            finish();
  }
  
}
