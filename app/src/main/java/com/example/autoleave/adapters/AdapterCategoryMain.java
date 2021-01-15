package com.example.autoleave.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.autoleave.MainActivity;
import com.example.autoleave.model.ItemCategoryMain;
import com.example.autoleave.R;

import java.util.ArrayList;


public class AdapterCategoryMain extends RecyclerView.Adapter<AdapterCategoryMain.categoryViewHolder> {
    private ArrayList<ItemCategoryMain> itemCategoryMain;
    private MyClicksListener myClicksListener;

    public AdapterCategoryMain(ArrayList<ItemCategoryMain> itemCategoryMain) {
        this.itemCategoryMain = itemCategoryMain;
    }

    @NonNull
    @Override
    public AdapterCategoryMain.categoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_categorymain,
                parent, false);
        return new categoryViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull categoryViewHolder holder, int position) {
        // from class name (itemCategoryMain)
        ItemCategoryMain icgm = itemCategoryMain.get(position);
        holder.imgg.setImageResource(icgm.imgg);
        holder.tvv.setText(icgm.tvv);
        holder.item.setText(icgm.item);

    }

    @Override
    public int getItemCount() {
        return itemCategoryMain.size();
    }

    public void setMyClicksListener(MyClicksListener myClicksListener) {
        this.myClicksListener = myClicksListener;
    }

    // new class view holder
    class categoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgg;
        TextView tvv;
        TextView item;

        public categoryViewHolder(@NonNull View itemView) {
            super(itemView);

            imgg = itemView.findViewById(R.id.imageView3);
            tvv = itemView.findViewById(R.id.textView2);
            item = itemView.findViewById(R.id.textView3);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = getLayoutPosition();

            if (myClicksListener != null) {
                myClicksListener.onMyAdapterClicked(v, pos);
            }
        }
    }

    public interface MyClicksListener {
        void onMyAdapterClicked(View v, int pos);
    }


}