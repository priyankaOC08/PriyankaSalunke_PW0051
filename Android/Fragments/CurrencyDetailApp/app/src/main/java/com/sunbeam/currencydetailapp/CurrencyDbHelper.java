package com.sunbeam.currencydetailapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CurrencyDbHelper  extends SQLiteOpenHelper {
    private static final String DBNAME = "Currency_db";
    private static final int VERSION = 1;


    public CurrencyDbHelper(@Nullable Context context) {
        super(context, DBNAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.e("dbHelper","onCreate");
        String sql = "CREATE TABLE currency(country TEXT,symbol TEXT,rating int,description TEXT)";
        db.execSQL(sql);
    }
    public void insertCar(Currency currency){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("country",currency.getCountry());
        values.put("symbol",currency.getSymbol());
        values.put("rating",currency.getRating());
        values.put("description",currency.getDescription());

        db.insert("currency",null,values);
    }

    public List<Currency> getCars(){
        List<Currency> currencies = new ArrayList<>();
        SQLiteDatabase db =getReadableDatabase();
        Cursor cursor =  db.query("currency",null,null,null,null,null,null);
        while (cursor.moveToNext())
        {
            Currency currency = new Currency(cursor.getString(0),
                    cursor.getString(1),cursor.getInt(2),cursor.getString(3));
            currencies.add(currency);
            Log.e("currencydetails ",currency.toString());
        }
        return currencies;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
