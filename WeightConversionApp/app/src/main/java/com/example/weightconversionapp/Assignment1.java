package com.example.weightconversionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Assignment1 extends AppCompatActivity {
    /*Get Data from Text field
    * Convert Data into String type
    * Convert String into Double data type*/

    public void cnvPs(View view){
        /*Convert Kilograms into Pounds
        * 1 kg = 2.20462 pbs*/

        EditText weightInKg = (EditText) findViewById(R.id.TxtKg);

        String strKg = weightInKg.getText().toString();

        Double dblKg = Double.parseDouble(strKg);

        Double PoundsAmount = dblKg * 2.20462;

        Toast.makeText(getApplicationContext(), "Weight in pounds = " + PoundsAmount + "lbs", Toast.LENGTH_LONG).show();
    }

    public void cnvKgs(View v){
        /*Convert Pounds into Kilograms
        * 1 lbs= 0.453592 kg*/

        EditText weightInLbs = (EditText) findViewById(R.id.TxtP);

        String strLbs = weightInLbs.getText().toString();

        Double dblLbs = Double.parseDouble(strLbs);

        Double KgAmount = dblLbs * 0.453592;

        Toast.makeText(getApplicationContext(), "Weight in pounds = " + KgAmount + "kg", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment1);
    }


}
