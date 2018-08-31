package com.thesachlab.espressosamples.ui.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thesachlab.espressosamples.R;

import java.util.ArrayList;

public class SampleRecyclerAdapter extends RecyclerView.Adapter<SampleRecyclerAdapter.MyViewHolder> {
    private ArrayList<String>data=new ArrayList<>();

    public SampleRecyclerAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_row_items,parent,false);

        return new MyViewHolder(mView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txtTitle.setText(data.get(position));
        holder.txtNumber.setText(String.valueOf(position+1));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView txtTitle,txtNumber;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtTitle=itemView.findViewById(R.id.txtTitle);
            txtNumber=itemView.findViewById(R.id.txtNumbring);
        }
    }
}
