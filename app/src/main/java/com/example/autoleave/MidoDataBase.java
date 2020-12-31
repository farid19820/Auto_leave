package com.example.autoleave;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MidoDataBase extends SQLiteOpenHelper {
    public static String price = "price";
   private final static String db_name ="MidoDb";
    private final static int version =1;
    public MidoDataBase(@Nullable Context context) {
        super(context, db_name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table all_car(id integer primary key autoincrement ,"+price+" String ," +
                "model String ,gear_type String ,year String ,killo_meters String ," +
                "engine_capacity String ,color String ,body_type String ,tyre_type String ,wheel String ," +
                "extra_features String )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
