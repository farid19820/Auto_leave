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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_categorymain,
                null,false);
        return new categoryViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull categoryViewHolder holder, int position) {
        // from class name (HomeCarAll)
        ItemCategoryMain icgm =itemCategoryMain.get(position);
        holder.imgg.setImageResource(icgm.imageCategoryMain);
        holder.tvv.setText(icgm.nameCategoryMain);
        holder.counterCategoryMain.setText(icgm.counterCategoryMain);

    }

    @Override
    public int getItemCount() {
        return itemCategoryMain.size();
    }

    // new class view holder
    static class categoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgg;
        TextView  tvv;
        TextView counterCategoryMain;

        public categoryViewHolder(@NonNull View itemView) {
            super(itemView);

            imgg = itemView.findViewById(R.id.imageView3);
            tvv = itemView.findViewById(R.id.textView2);
            counterCategoryMain = itemView.findViewById(R.id.textView3);
        }
    }


}