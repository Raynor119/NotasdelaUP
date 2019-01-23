package com.pixels.cc;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.pixels.cc.R;
import java.util.List;

public class recyprom extends RecyclerView.Adapter<recyprom.ViewHolder> implements View.OnClickListener{
	public int idtex;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView Materia,Promedio;
        Context context;

        public ViewHolder(View itemView) {
            super(itemView);

            Materia=(TextView)itemView.findViewById(R.id.Materiatxte);
            Promedio=(TextView)itemView.findViewById(R.id.Nprome);


        }
    }
	
	public List<promm> promedioLista;

    private View.OnClickListener listener;

    public  recyprom(List<promm> promedioLista){

        this.promedioLista=promedioLista;

    }
	@Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promedio,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        view.setOnClickListener(this);

        return viewHolder;
    }
	@Override
    public void onBindViewHolder(ViewHolder holder,int position){


        holder.Materia.setText(promedioLista.get(position).getMateria());
        holder.Promedio.setText(promedioLista.get(position).getPromedio());



    }
	
	public void setOnClickListener(View.OnClickListener listener) {
		this.listener=listener;
    }
    @Override
    public void onClick(View view){
		if(listener!=null){


            int positi=idtex;
            listener.onClick(view);


		}

    }

    @Override
    public int getItemCount() {
        return promedioLista.size();
    }
	
	
}

