package com.example.autoleave.activities;

import androidx.appcompat.app.AppCompatActivity;

import com.example.autoleave.MainActivity;
import com.example.autoleave.model.ItemCategoryMain;
import com.example.autoleave.R;
import com.example.autoleave.adapters.AdapterCategoryMain;
import com.example.autoleave.databinding.ActivityCategoryMainBinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class categoryMain extends AppCompatActivity {
    private ActivityCategoryMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategoryMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<ItemCategoryMain> itemCategoryMainList = new ArrayList<>();

        //Row 0 "Car for Rent"
        ItemCategoryMain instance1 = new ItemCategoryMain(R.drawable.baseline_local_taxi_black_18dp," Car for Rent","25300");
        itemCategoryMainList.add(instance1);

        //Row 1 "Car for Sale"
        ItemCategoryMain instance2 = new ItemCategoryMain(R.drawable.ic_car01,"Car for Sale","17300");
        itemCategoryMainList.add(instance2);

        //Row 2 "Pickup,Heavy Cars for Sale"
        ItemCategoryMain instance3 = new ItemCategoryMain(R.drawable.baseline_local_shipping_black_18dp,"Pickup,Heavy Cars for Sale","12500");
        itemCategoryMainList.add(instance3);

        //Row 3 "Motorcycle for Sale"
        ItemCategoryMain instance4 = new ItemCategoryMain(R.drawable.baseline_two_wheeler_black_18dp,"Motorcycle for Sale","137");
        itemCategoryMainList.add(instance4);


//        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
//        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
//        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
//        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
//        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
//        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));
//        itemCategoryMainList.add(new ItemCategoryMain(R.drawable.ic_car01,"car for rent","12500"));12500

        AdapterCategoryMain adapter = new AdapterCategoryMain (itemCategoryMainList );
        binding.categoryMainRv.setHasFixedSize(true);
        binding.categoryMainRv.setAdapter(adapter);
        
        adapter.setMyClicksListener(new AdapterCategoryMain.MyClicksListener() {
            @Override
            public void onMyAdapterClicked(View v, int pos) {
                switch (pos){
                    case 0 :
                        Intent intent =new Intent(categoryMain.this , MainActivity.class);
                        startActivity(intent);
                        break;
                }
                Toast.makeText(categoryMain.this , "position : "+pos , Toast.LENGTH_SHORT).show();
            }
        });

       /* RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this , RecyclerView.VERTICAL , false);

        binding.categoryMainRv.setLayoutManager(layoutManager);*/









    }
}