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


public class digitarm extends Activity {
    EditText mater,credit;
    Button btM;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digitarm);
        mater = (EditText) findViewById(R.id.editext1);
        btM = (Button) findViewById(R.id.bottom);
        credit= (EditText) findViewById(R.id.editext12);

        final basededatos Basededatos = new basededatos(getApplicationContext());
		final cantidm bat =new cantidm(getApplicationContext());
        btM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
				
                capmm buscar =new capmm();
                String materit= String.valueOf(mater.getText().toString());
                String primerC="0.0";
                String segundoC="0.0";
                String tercerC="0.0";
                String PromediO="0.0";
                String Credito= String.valueOf(credit.getText().toString());
                if(materit.equals("")||Credito.equals("")){
                    Toast.makeText(getApplicationContext(), "digite la materia", Toast.LENGTH_LONG).show();
                }
                else {
                    Basededatos.agregarM(materit,Credito,primerC,segundoC,tercerC,PromediO);
					bat.buscadatos(buscar,"M");
					String Nume=buscar.getNum();

					int tt=Integer.parseInt(Nume);
					tt=tt+1;
					String yy=String.valueOf(tt);
                    Toast.makeText(getApplicationContext(), "datos agregados", Toast.LENGTH_LONG).show();
					bat.prot("M",yy);
      mater.setText("");
      credit.setText("");
                }

            }
        });

        }
}
