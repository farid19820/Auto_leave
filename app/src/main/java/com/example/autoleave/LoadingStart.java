package com.example.autoleave;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoadingStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_start);

        TextView tv =  findViewById(R.id.tv_loading);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { OpenMainActivity(); }

            public void OpenMainActivity() {
                Intent intent = new Intent(getBaseContext(),categoryMain.class);
                startActivity(intent);
            }
        });

    }
}