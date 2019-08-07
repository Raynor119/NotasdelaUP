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
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.pixels.cc.R;

public class menu extends Fragment {
	View vie;
	public menu() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
		vie=inflater.inflate(R.layout.activity_menu, container, false);
		
		return vie;
		}
	
     public void sali(View v){
		 getActivity().finish();
     }
     public void digit(View v){
       Intent intent =new Intent(getActivity(),digitarm.class);
		 getActivity().startActivity(intent);
     }
     public void most(View v){
         Intent intent =new Intent(getActivity(),mostrar.class);
		 getActivity().startActivity(intent);
}
     public void pormeed(View v){
		 Intent intent =new Intent(getActivity(),promed.class);
		 getActivity().startActivity(intent);
	 }

}
