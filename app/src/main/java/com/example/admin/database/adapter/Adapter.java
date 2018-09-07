package com.example.admin.database.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.admin.database.R;
import com.example.admin.database.model.Data;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<Data> list;
    private int rowLayout;
    private Context context;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout moviesLayout;
        TextView id,title;


        public ViewHolder(View v) {
            super(v);
            id = v.findViewById(R.id.id);
            title=v.findViewById(R.id.title);
        }
    }

    public Adapter(List<Data> list,int rowLayout, Context context) {
        this.list=list;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.id.setText(list.get(position).getId());
        holder.title.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return 2;
    }

}
