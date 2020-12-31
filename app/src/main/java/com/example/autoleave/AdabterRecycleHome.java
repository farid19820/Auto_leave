package com.example.autoleave;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdabterRecycleHome extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
final int HOLDER1=23;
final int HOLDER2 = 34 ;
    ArrayList<HomeCarAll> homeCarAll;

    public AdabterRecycleHome(ArrayList<HomeCarAll> homeCarAlls) {
        this.homeCarAll = homeCarAlls;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       if (viewType == HOLDER1){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custem_card_layout,
                    null,false);
            return new CarViewHolder1(v);
        }else if (viewType == HOLDER2){
           View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_small,
                    null,false);
           return new CarViewHolder2(v);
         }
      return null;
    }

    @Override
    public int getItemViewType(int position) {
        if (position <3){
            return HOLDER1 ;
        }else {
            return HOLDER2 ;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // from class name (HomeCarAll)
        HomeCarAll ca =homeCarAll.get(position);
        if (holder instanceof CarViewHolder1) {

            ((CarViewHolder1) holder).img.setImageResource(ca.img);
            ((CarViewHolder1) holder).tv.setText(ca.name);

        }else if (holder instanceof CarViewHolder2){
            ((CarViewHolder2) holder).img.setImageResource(ca.img);
            ((CarViewHolder2) holder).tv.setText(ca.name);
        }

    }

    @Override
    public int getItemCount() {
        return homeCarAll.size();
    }

    // new class view holder
    static class CarViewHolder1 extends RecyclerView.ViewHolder {
        ImageView img;
        TextView  tv;

        public CarViewHolder1(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.custem_car_iv);
            tv = itemView.findViewById(R.id.tv_title);
        }
    }
    static class CarViewHolder2 extends RecyclerView.ViewHolder {
        ImageView img;
        TextView  tv;

        public CarViewHolder2(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.custem_car_iv);
            tv = itemView.findViewById(R.id.tv_title);
        }
    }

}
