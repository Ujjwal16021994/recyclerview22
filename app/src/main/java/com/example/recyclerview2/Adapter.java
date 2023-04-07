package com.example.recyclerview2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHHolder>{

    Context context;
    ArrayList<SampleData> list;
    Adapter(Context context,ArrayList<SampleData> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public viewHHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout12,parent,false);
        viewHHolder vhgt = new viewHHolder(v);
        return vhgt;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHHolder holder, int position) {
        holder.name.setText(list.get(position).name);
        holder.img.setImageResource(list.get(position).image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView img;
        TextView name;
        public viewHHolder(@NonNull View itemView) {
            super(itemView);
                img = itemView.findViewById(R.id.idimage);
                name = itemView.findViewById(R.id.idname);
                itemView.setOnClickListener(this);
        }
        public void onClick(View v) {
            int position = this.getAdapterPosition();
            Toast.makeText(context,"Position : "+position+"\nname : "+list.get(position).name,Toast.LENGTH_LONG).show();

        }

    }
}
