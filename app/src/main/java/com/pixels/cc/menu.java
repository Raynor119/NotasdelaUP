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
import com.pixels.cc.R;

public class menu extends Activity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu);
       }
     public void sali(View v){
       finish();
     }
     public void digit(View v){
       Intent intent =new Intent(menu.this,digitarm.class);
            startActivity(intent);
     }
     public void most(View v){
         Intent intent =new Intent(menu.this,mostrar.class);
            startActivity(intent);
}
     public void pormeed(View v){
		 Intent intent =new Intent(menu.this,promed.class);
		 startActivity(intent);
	 }

}
