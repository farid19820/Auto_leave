package com.example.autoleave;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class AdapterCategoryMain extends RecyclerView.Adapter< AdapterCategoryMain.categoryViewHolder> {
    ArrayList<ItemCategoryMain> itemCategoryMain;

    public AdapterCategoryMain(ArrayList <ItemCategoryMain> itemCategoryMain) {
        this.itemCategoryMain = itemCategoryMain;
    }

    @NonNull
    @Override
    public AdapterCategoryMain.categoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_categorymain,
                parent,false);
        return new categoryViewHolder(v);
    }



    @Override
    public void onBindViewHolder(@NonNull categoryViewHolder holder, int position) {
        // from class name (itemCategoryMain)
        ItemCategoryMain icgm =itemCategoryMain.get(position);
        holder.imgg.setImageResource(icgm.imgg);
        holder.tvv.setText(icgm.tvv);
        holder.item.setText(icgm.item);

    }

    @Override
    public int getItemCount() {
        return itemCategoryMain.size();
    }

    // new class view holder
    static class categoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgg;
        TextView  tvv;
        TextView item;

        public categoryViewHolder(@NonNull View itemView) {
            super(itemView);

            imgg = itemView.findViewById(R.id.imageView3);
            tvv = itemView.findViewById(R.id.textView2);
            item = itemView.findViewById(R.id.textView3);
        }
    }


}