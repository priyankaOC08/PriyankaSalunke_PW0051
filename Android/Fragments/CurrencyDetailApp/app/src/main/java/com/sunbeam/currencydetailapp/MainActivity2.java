package com.sunbeam.currencydetailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import  com.sunbeam.currencydetailapp.CurrencyDbHelper;
import  com.sunbeam.currencydetailapp.R;
import  com.sunbeam.currencydetailapp.Currency;

public class MainActivity2 extends AppCompatActivity {
    EditText editcountry, editsymbol, editrate,editdescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editcountry = findViewById(R.id.editcountry);
        editsymbol = findViewById(R.id.editsymbol);
        editrate = findViewById(R.id.editrate);
        editdescription = findViewById(R.id.editdescription);



    }
    public void AddData(View view)
    {
        Currency currency = new Currency(editcountry.getText().toString(), editsymbol.getText().toString(),
                Integer.parseInt(editrate.getText().toString()),editdescription.getText().toString());

        CurrencyDbHelper dbhelper = new CurrencyDbHelper(this);
        dbhelper.insertCar(currency);
        finish();

    }



}