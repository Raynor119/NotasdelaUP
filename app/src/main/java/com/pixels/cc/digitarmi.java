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

public class digitarmi extends Activity {
EditText mater,credit;
    Button btM;
	int t=0;
	
    
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digitarmi);
        mater = (EditText) findViewById(R.id.editext1);
        btM = (Button) findViewById(R.id.bottom);
        credit= (EditText) findViewById(R.id.editext12);
		
        final basededatos Basededatos = new basededatos(getApplicationContext());
        btM.setOnClickListener(new View.OnClickListener() {
        final cantidm bas=new cantidm(getApplicationContext());
            @Override
            public void onClick(View v) {
                if(t==0){
                String materit= String.valueOf(mater.getText().toString());
                String primerC="0.0";
                String segundoC="0.0";
                String tercerC="0.0";
                String PromediO="0.0";
                String Credito= String.valueOf(credit.getText().toString());
                if(materit.equals("")||Credito.equals("")){
                    Toast.makeText(getApplicationContext(), "digite la materia o credito", Toast.LENGTH_LONG).show();
                }
                else {
                    Basededatos.agregarM(materit,Credito,primerC,segundoC,tercerC,PromediO);
					String m="M";
					String y="1";
                    bas.agregarM(m,y);
                    Toast.makeText(getApplicationContext(), "datos agregados", Toast.LENGTH_LONG).show();
      
      mater.setText("");
      credit.setText("");
	   t=1;
                }
            }
			 else
				 {
					 capmm buscar =new capmm();
					 String materit= String.valueOf(mater.getText().toString());
					 String primerC="0.0";
					 String segundoC="0.0";
					 String tercerC="0.0";
					 String PromediO="0.0";
					 String Credito= String.valueOf(credit.getText().toString());
					 if(materit.equals("")||Credito.equals("")){
						 Toast.makeText(getApplicationContext(), "digite la materia o credito", Toast.LENGTH_LONG).show();
					 }
					 else {
						 Basededatos.agregarM(materit,Credito,primerC,segundoC,tercerC,PromediO);
                         bas.buscadatos(buscar,"M");
						 String Nume=buscar.getNum();
						 
						 int tt=Integer.parseInt(Nume);
						 tt=tt+1;
						 String yy=String.valueOf(tt);
						 Toast.makeText(getApplicationContext(), "datos agregados", Toast.LENGTH_LONG).show();
                        bas.prot("M",yy);
						 mater.setText("");
						 credit.setText("");
	
              }
           }
      }
		  
	   });
      
        }
        public void sigu(View v){
          Intent intent =new Intent(digitarmi.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
}
