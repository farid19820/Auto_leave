package com.example.autoleave;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.autoleave.databinding.ActivityCategoryMainBinding;
import com.example.autoleave.databinding.ActivityMainBinding;

import android.os.Bundle;

import java.util.ArrayList;

public class categoryMain extends AppCompatActivity {
    private ActivityCategoryMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategoryMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<ItemCategoryMain> itemCategoryMainList = new ArrayList<>();

        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01," car for sale","25300"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_add01,"car for rent","12500"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_search01,"car for rent","12500"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));

        AdapterCategoryMain adapterCategoryMain = new AdapterCategoryMain (itemCategoryMainList);
        binding.categoryMainRv.setHasFixedSize(true);
        binding.categoryMainRv.setAdapter(adapterCategoryMain);

       /* RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this , RecyclerView.VERTICAL , false);

        binding.categoryMainRv.setLayoutManager(layoutManager);*/









    }
}