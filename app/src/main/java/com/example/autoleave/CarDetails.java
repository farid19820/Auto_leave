package com.example.autoleave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.autoleave.databinding.ActivityCarDetailsBinding;

public class CarDetails extends AppCompatActivity {
private ActivityCarDetailsBinding binding ;
    Car car ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button btnPreviewAdd = (Button)findViewById(R.id.btn_submit);
        btnPreviewAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {OpenPreviewAdd();

            }

            private void OpenPreviewAdd() {
                Intent intent = new Intent(getBaseContext(),PreviewAdd.class);
                startActivity(intent);

            }
        });
    }

    public void saveData(View view) {
         int id=-1;
         String price=binding.price.getText().toString();
         String model=binding.model.getText().toString();
         String gear_type=binding.gearType.getText().toString();
         String year=binding.year.getText().toString();;
         String killo_meters=binding.killometers.getText().toString();;
         String engine_capacity=binding.engineCapacity.getText().toString();;
         String color=binding.color.getText().toString();;
         String body_type=binding.bodyType.getText().toString();;
         String tyre_type=binding.tireType.getText().toString();;
         String wheel=binding.wheel.getText().toString();;
         String extra_features=binding.extraFeatures.getText().toString();;
         car = new Car(id,price,model,gear_type,year,killo_meters,engine_capacity,
                color,body_type,tyre_type,wheel,extra_features);
         insertIntoDataBasa();
    }
    private void insertIntoDataBasa(){
        MidoDataBase midoDataBase = new MidoDataBase(this);
       SQLiteDatabase db = midoDataBase.getWritableDatabase();
        Cursor cursor = db.query("all_car" , null ,
                null ,null,null,null,null);
        ContentValues cv = new ContentValues();
        cv.put(MidoDataBase.price,car.getPrice());
        cv.put("model",car.getModel());
        cv.put("gear_type",car.getGear_type());
        cv.put("year",car.getYear());
        cv.put("killo_meters",car.getKillo_meters());
        cv.put("engine_capacity",car.getEngine_capacity());
        cv.put("color",car.getColor());
        cv.put("body_type",car.getBody_type());
        cv.put("tyre_type",car.getTyre_type());
        cv.put("wheel",car.getPrice());
        cv.put("extra_features",car.getExtra_features());
        db.insert("all_car",null , cv);
        cursor.close();
    }



    /*private String getValue(){

    }*/
}