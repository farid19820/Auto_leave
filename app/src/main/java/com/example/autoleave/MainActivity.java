package com.example.autoleave;
//git add . && git commit -m "xxx" && git push origin master

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.autoleave.databinding.ActivityMainBinding;

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
      //  Toolbar tl = findViewById(R.id.title);
     //   setSupportActionBar(tl);

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

        homeCarAlls.add(new HomeCarAll(R.drawable.c17,"1600cc"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c12,"1600cc"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c18,"1600cc"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c19,"1600cc"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c12,"1600cc"));
        homeCarAlls.add(new HomeCarAll(R.drawable.c17,"1600cc"));

        AdabterRecycleHome adabterRecycleHome = new AdabterRecycleHome (homeCarAlls);
        binding.mainRv.setHasFixedSize(true);
        binding.mainRv.setAdapter(adabterRecycleHome);
      //  binding.mainRvHor.setAdapter(adabterRecycleHome);
    }

    public void openDetails(View view) {
        startActivity(new Intent(this , CarDetails.class));
    }

    // @Override
  //  public  boolean   onCreateOptionsMenu(Menu menu){
   // getMenuInflater().inflate(R.menu,menu);
    //return true;

    //}
}