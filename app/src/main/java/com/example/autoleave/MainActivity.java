package com.example.autoleave;
//git add . && git commit -m "15jan" && git push origin master

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.autoleave.adapters.AdabterRecycleHome;
import com.example.autoleave.databinding.ActivityMainBinding;
import com.example.autoleave.model.HomeCarAll;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // you should inflate binding before setContent method
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(getResources().getColor(R.color.primary));
      //Toolbar tl = findViewById(R.id.title);
     //setSupportActionBar(tl);

                // 2 button driver and no driver
             Button btnDriver = (Button)findViewById(R.id.btn_driver);
             btnDriver.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) { OpenDriver();

                     }

                     private void OpenDriver() {
                       Intent intent = new Intent(getBaseContext(),Driver.class);
                      startActivity(intent);

                      }
                     });

                 Button btnNoDrive = (Button) findViewById(R.id.btn_nodriver);
                 btnNoDrive.setOnClickListener(new View.OnClickListener() {
                   @Override
                     public void onClick(View v) {OpenNoDriver();

                         }

                         private void OpenNoDriver() {
                       Intent intent = new Intent(getBaseContext(),NoDriver.class);
                      startActivity(intent);
                      }
                      });

                //recycle view main page

        ArrayList<HomeCarAll> homeCarAlls = new ArrayList<>();

        homeCarAlls.add(new HomeCarAll(R.drawable.c17,"أجر سيارتك المفضلة بأفضل .. سعر لدواعي السفر سعر"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c12,"The Best Car for BMW 2020 yes you can now"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c18,"The Best Car for BMW 2020 yes you can now"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c19,"The Best Car for BMW 2020 yes you can now"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c12,"The Best Car for BMW 2020 yes you can now"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c17,"The Best Car for BMW 2020 yes you can now"));

        AdabterRecycleHome adabterRecycleHome = new AdabterRecycleHome (homeCarAlls);
        binding.mainRv.setHasFixedSize(true);
        binding.mainRv.setAdapter(adabterRecycleHome);
      //  binding.mainRvHor.setAdapter(adabterRecycleHome);
    }

    public void openDetails(View view) {
        startActivity(new Intent(this , AddVehicleFormat.class));
    }

    // @Override
  //  public  boolean   onCreateOptionsMenu(Menu menu){
   // getMenuInflater().inflate(R.menu,menu);
    //return true;

    //}
}