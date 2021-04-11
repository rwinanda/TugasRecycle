package com.example.recyclenanda;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class KlubAdapter extends RecyclerView.Adapter<KlubAdapter.ListViewHolder>{
    private ArrayList<Klub> listklub;

    public KlubAdapter(ArrayList<Klub> list) {
        this.listklub = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_epl, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Klub klub = listklub.get(position);
        Glide.with(holder.itemView.getContext())
                .load(klub.getLogo())
                .apply(new RequestOptions().override(75,75))
                .into(holder.imgLogo);
        holder.namaKlub.setText(klub.getNamaklub());
        holder.desKlub.setText(klub.getDesklub());
    }

    @Override
    public int getItemCount() {
        return listklub.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView namaKlub;
        TextView desKlub;

        ListViewHolder(View itemview) {
            super(itemview);
            imgLogo = itemview.findViewById(R.id.logo);
            namaKlub = itemview.findViewById(R.id.namaklub);
            desKlub = itemview.findViewById(R.id.desklub);
        }
    }
}
