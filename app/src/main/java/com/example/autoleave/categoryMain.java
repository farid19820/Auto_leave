package com.example.autoleave;

import androidx.appcompat.app.AppCompatActivity;
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
        setContentView(R.layout.activity_category_main);



        ArrayList<ItemCategoryMain> itemCategoryMain = new ArrayList<>();

        itemCategoryMain.add(new ItemCategoryMain(R.drawable.ic_car01,"سيارات للبيع",25300));




        AdapterCategoryMain adapterCategoryMain = new AdapterCategoryMain (itemCategoryMain);
        binding.categoryMainRv.setHasFixedSize(true);
        binding.categoryMainRv.setAdapter(adapterCategoryMain);








    }
}