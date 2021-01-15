package com.example.autoleave;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.example.autoleave.databinding.ActivityAddVehicleFormatBinding;
import com.example.autoleave.model.MasterArray;

import java.util.ArrayList;

public class AddVehicleFormat extends AppCompatActivity {
    private String TAG = "AddVehicleFormatTag";
private ActivityAddVehicleFormatBinding binding ;
    Car car ;

    MasterArray masterArray =  new MasterArray();
    public static final int request_code_camera = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddVehicleFormatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //----------------------------------------------------------------------------
        // image 1 camera and galary
        binding.image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1 Camera & Galary Permission
                if (ContextCompat.checkSelfPermission(AddVehicleFormat.this, Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED){
                // request Permission
                String [] Permission = {Manifest.permission.CAMERA};
                ActivityCompat.requestPermissions(AddVehicleFormat.this,Permission,request_code_camera);
            }
            }
        });
        //----------------------------------------------------------------------------
          // 2 Camera & Galary Permission
        binding.image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {requestCode();
            }

            private void requestCode() {



            }
        });
        //----------------------------------------------------------------------------
        // submit button
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
        masterArray.getList("Audi");
        masterArray.getList("Speranza");
        initSpinner();





         // اسبينر التصنيفات الرئيسية للمركبات
        // on click item selected listner for spinner category main
        binding.spinnerCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),"your choose"+position,Toast.LENGTH_SHORT).show();

                switch (position){
                    case 1:
                        // Kilometer
                        binding.kilometerText.setVisibility(View.VISIBLE);
                        binding.KilometerInput.setVisibility(View.VISIBLE);
                        // transsion Type
                        binding.transsionTypeText.setVisibility(View.VISIBLE);
                        binding.transmissionsGroup.setVisibility(View.VISIBLE);
                        // capacity
                        binding.capacityText.setVisibility(View.VISIBLE);
                        binding.capacity.setVisibility(View.VISIBLE);
                        // license Expire
                        binding.licenseExpireText.setVisibility(View.VISIBLE);
                        binding.spinnerDate.setVisibility(View.VISIBLE);
                        binding.spinnerYear2.setVisibility(View.VISIBLE);
                        // price Period
                        binding.pricePeriodText.setVisibility(View.GONE);
                        binding.spinnerPeriod.setVisibility(View.GONE);
                        binding.pricePeriodInput.setVisibility(View.GONE);
                        // price
                        binding.priceText.setVisibility(View.VISIBLE);
                        binding.price.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        // Kilometer
                        binding.kilometerText.setVisibility(View.VISIBLE);
                        binding.KilometerInput.setVisibility(View.VISIBLE);
                        // transsion Type
                        binding.transsionTypeText.setVisibility(View.VISIBLE);
                        binding.transmissionsGroup.setVisibility(View.VISIBLE);
                        // capacity
                        binding.capacityText.setVisibility(View.VISIBLE);
                        binding.capacity.setVisibility(View.VISIBLE);
                        // license Expire
                        binding.licenseExpireText.setVisibility(View.VISIBLE);
                        binding.spinnerDate.setVisibility(View.VISIBLE);
                        binding.spinnerYear2.setVisibility(View.VISIBLE);
                        // price Period
                        binding.pricePeriodText.setVisibility(View.VISIBLE);
                        binding.spinnerPeriod.setVisibility(View.VISIBLE);
                        binding.pricePeriodInput.setVisibility(View.VISIBLE);

                    case 3:

                        // price Period
                        binding.pricePeriodText.setVisibility(View.VISIBLE);
                        binding.spinnerPeriod.setVisibility(View.VISIBLE);
                        binding.pricePeriodInput.setVisibility(View.VISIBLE);
                        // price
                        binding.priceText.setVisibility(View.GONE);
                        binding.price.setVisibility(View.GONE);

                    return;
                }





            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }





    private void initModelSpinner(String id ){
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this ,
                        R.layout.spinner_item ,
                        masterArray.getList(id)){

                };
        binding.spinnerModel.setAdapter(adapter);
    }
    private void initSpinner(){
        ArrayList<String> mainList = masterArray.getList("main");
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this , R.layout.spinner_item , mainList ){

        };
        binding.spinnerBrand.setAdapter(adapter);
        binding.spinnerBrand.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.v(TAG , "POSITION : "+position);
                String brandId = mainList.get(position);
                initModelSpinner(brandId);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void saveData(View view) {
         int id=-1;







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

    // Request Permissions Result
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case request_code_camera:
                if (grantResults.length>0 && grantResults [0]== PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"تم الحصول على صلاحية الكاميرا",Toast.LENGTH_SHORT).show();
                }
                return;
        }
    }

}
