package com.pixels.cc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class menu extends Fragment{
	View vie;
	Button salir,digit,most,pormeed;
	
	menu(){

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
		most=vie.findViewById(R.id.botton01);
		digit=vie.findViewById(R.id.botton02);
		pormeed=vie.findViewById(R.id.botton03);
		salir=vie.findViewById(R.id.botton04);
		
		most.setOnClickListener(new View.OnClickListener(){
			@Override 
			public void onClick(View view){
				Intent intent =new Intent(getActivity(),mostrar.class);
				getActivity().startActivity(intent);
				
			}
			
		});
		
		digit.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View view){
				Intent intent =new Intent(getActivity(),digitarm.class);
				getActivity().startActivity(intent);
			}
		});
		
		pormeed.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View view){
				Intent intent =new Intent(getActivity(),promed.class);
				getActivity().startActivity(intent);
			
			}
			
		});
		salir.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View view){
				getActivity().finish();
			}
			
		});
		return vie;
	}
	
   
		

}
