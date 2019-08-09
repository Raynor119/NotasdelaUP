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
import java.util.ArrayList;
import java.util.List;

import com.pixels.cc.R;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface;


public class vmateri extends Activity {
  TextView Mat1eria,Credi,Nprimer,Nsegundo,Ntercer,Prome;
 basededatos Bas; String matr,Mater;
 promm buscar;

 Button primet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vmateri);
       
       Bundle extreras = getIntent().getExtras();
       Mater = extreras.getString("Materia1");
       buscar = new promm();
       Bas = new basededatos(getApplicationContext());
        Mat1eria= (TextView) findViewById(R.id.txtm);
       
       Mat1eria.setText(""+Mater);
        Credi =(TextView) findViewById(R.id.Credito12);
        Nprimer =(TextView) findViewById(R.id.notadeNp);
        Nsegundo =(TextView) findViewById(R.id.notadeNs);
        Ntercer =(TextView) findViewById(R.id.notadeNt);
        Prome =(TextView) findViewById(R.id.notadep);

        Bas.buscardatos(buscar,Mater);


        Credi.setText(buscar.getPromedio());
        Nprimer.setText(buscar.getPrimer());
        Nsegundo.setText(buscar.getSegundo());
        Ntercer.setText(buscar.getTercer());
        Prome.setText(buscar.getPromet());


        primet =(Button)findViewById(R.id.bottondpm);
        primet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String N1=buscar.getPrimer();
                AlertDialog.Builder alert= new AlertDialog.Builder(vmateri.this);
                double Prit=Double.parseDouble(N1);
                if(Prit==0.0){
                    String r="0";
                    Intent intent =new Intent(vmateri.this,primercorte.class);
                    intent.putExtra("Mate1",Mater);
                    intent.putExtra("veri",r);
                    startActivity(intent);
                    finish();
                }
                else{


                    alert.setMessage("Se va a cambiar la Nota del Primer Corte")
                            .setCancelable(false)
                            .setPositiveButton("si", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialog,int which){
                     String r="1";
                    Intent intent =new Intent(vmateri.this,primercorte.class);
                    intent.putExtra("Mate1",Mater);
                    intent.putExtra("veri",r);
                    startActivity(intent);


                                    finish();
                                }

                            })
                            .setNegativeButton("no", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialog,int which){



                                    dialog.cancel();
                                }

                            });
                    AlertDialog titulo=alert.create();
                    titulo.setTitle("Alerta");
                    titulo.show();


                }
            }
        });

    }
  
  public void reci(View v)
   {

      Intent intent =new Intent(vmateri.this,mostrar.class);
            startActivity(intent);
            finish();
   }
   public void primet(View v){

            
   }
   public void segunrt(View v){
     
  String N1=buscar.getSegundo();
                AlertDialog.Builder alert= new AlertDialog.Builder(vmateri.this);
                double Prit=Double.parseDouble(N1);
                if(Prit==0.0){
                    String r="0";
                    Intent intent =new Intent(vmateri.this,segundocorte.class);
                    intent.putExtra("Mate1",Mater);
                    intent.putExtra("veri",r);
                    startActivity(intent);
                    finish();
                }
                else{


                    alert.setMessage("Se va a cambiar la Nota del Segundo Corte")
                            .setCancelable(false)
                            .setPositiveButton("si", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialog,int which){
                     String r="1";
                    Intent intent =new Intent(vmateri.this,segundocorte.class);
                    intent.putExtra("Mate1",Mater);
                    intent.putExtra("veri",r);
                    startActivity(intent);


                                    finish();
                                }

                            })
                            .setNegativeButton("no", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialog,int which){



                                    dialog.cancel();
                                }

                            });
                    AlertDialog titulo=alert.create();
                    titulo.setTitle("Alerta");
                    titulo.show();


                }
            }
        
   public void teer(View v){
   String N1=buscar.getTercer();
                AlertDialog.Builder alert= new AlertDialog.Builder(vmateri.this);
                double Prit=Double.parseDouble(N1);
                if(Prit==0.0){
                    String r="0";
                    Intent intent =new Intent(vmateri.this,tercercorte.class);
                    intent.putExtra("Mate1",Mater);
                    intent.putExtra("veri",r);
                    startActivity(intent);
                    finish();
                }
                else{


                    alert.setMessage("Se va a cambiar la Nota del Tercer Corte")
                            .setCancelable(false)
                            .setPositiveButton("si", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialog,int which){
                     String r="1";
                    Intent intent =new Intent(vmateri.this,tercercorte.class);
                    intent.putExtra("Mate1",Mater);
                    intent.putExtra("veri",r);
                    startActivity(intent);


                                    finish();
                                }

                            })
                            .setNegativeButton("no", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialog,int which){



                                    dialog.cancel();
                                }

                            });
                    AlertDialog titulo=alert.create();
                    titulo.setTitle("Alerta");
                    titulo.show();


                }
   }
   public void elimin(View v){
	   cantidm bat=new cantidm(getApplicationContext());
	   capmm buca=new capmm();
	    
	   bat.buscadatos(buca,"M");
	   
	   String n=buca.getNum();
	   int nn=Integer.parseInt(n);
	   nn=nn-1;
	   String nb=String.valueOf(nn);
	   
	   bat.prot("M",nb);
	   
	   
   Bas.elimiN(Mater);
     Intent intent =new Intent(vmateri.this,mostrar.class);
            
            startActivity(intent);
            finish();
     
   }
}

