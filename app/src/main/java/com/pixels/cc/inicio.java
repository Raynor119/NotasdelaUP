package com.pixels.cc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.SharedPreferences;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.content.IntentSender;
import com.pixels.cc.R;


public class inicio extends AppCompatActivity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
       new android.os.Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent intent;
                switch(getFirstTimeRun(this)) {
                    case 0:
                        intent = new Intent(inicio.this,digitarmi.class);
                        startActivity(intent);
                        finish();
                        break;
                    case 1:
                       intent = new Intent(inicio.this, main.class);
                        startActivity(intent);
                        finish();
                        break;
                    case 2:

                        break;
                }






            }
        },1000);

}
public int getFirstTimeRun(Runnable contexto) {
        SharedPreferences sp = getSharedPreferences("MYAPP", 0);
        int result, currentVersionCode = 2;
        int lastVersionCode = sp.getInt("FIRSTTIMERUN", -1);
        if (lastVersionCode == -1) result = 0; else
            result = (lastVersionCode == currentVersionCode) ? 1 : 2;
        sp.edit().putInt("FIRSTTIMERUN", currentVersionCode).apply();
        return result;
    }
}
