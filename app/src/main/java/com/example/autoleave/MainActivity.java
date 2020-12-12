package com.example.autoleave;
//git add . && git commit -m "xxx" && git push origin master

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(getResources().getColor(R.color.primary));
      //  Toolbar tl = findViewById(R.id.title);
     //   setSupportActionBar(tl);



    }

   // @Override
  //  public  boolean   onCreateOptionsMenu(Menu menu){
   // getMenuInflater().inflate(R.menu,menu);
    //return true;

    //}
}