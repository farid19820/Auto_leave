package com.example.autoleave;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class AdabterRecycleHome extends RecyclerView.Adapter< AdabterRecycleHome.CarViewHolder> {
    ArrayList<HomeCarAll> homeCarAll;

    public AdabterRecycleHome(ArrayList<HomeCarAll> homeCarAlls) {
        this.homeCarAll = homeCarAlls;
    }

    @NonNull
    @Override
    public AdabterRecycleHome.CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custem_card_layout,
                null,false);
        return new CarViewHolder(v);
    }



    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        // from class name (HomeCarAll)
        HomeCarAll ca =homeCarAll.get(position);
        holder.img.setImageResource(ca.img);
        holder.tv.setText(ca.name);

    }

    @Override
    public int getItemCount() {
        return homeCarAll.size();
    }

    // new class view holder
    static class CarViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView  tv;

        public CarViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.custem_car_iv);
            tv = itemView.findViewById(R.id.tv_title);
        }
    }


}