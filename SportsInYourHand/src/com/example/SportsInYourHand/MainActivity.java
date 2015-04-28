package com.example.SportsInYourHand;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
/**
 * Created by Udayanga Senanayake on 4/28/2015.
 */
public class MainActivity extends Activity {

    private Spinner countryList,sportList;
    private Button btnSubmit;
    String[] country={"Sri Lanka","India","England","Australia"};
    String [] sport={"Cricket","Foot Ball","Rugger",};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        addItemlist();

          }

    public void addItemlist()
    {
        countryList=(Spinner)findViewById(R.id.spinnerCountry);
        ArrayAdapter<String>dataAdapterCountry=new ArrayAdapter<String>
                (MainActivity.this,android.R.layout.simple_spinner_dropdown_item,country);
        dataAdapterCountry.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        countryList.setAdapter(dataAdapterCountry);

        sportList=(Spinner)findViewById(R.id.spinnerSport);
        ArrayAdapter<String>dataAdapterSport=new ArrayAdapter<String>
                (MainActivity.this,android.R.layout.simple_spinner_dropdown_item,sport);
        dataAdapterSport.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        sportList.setAdapter(dataAdapterSport);


        addListenerOnButton();
    }
       // get the selected dropdown list value
    public void addListenerOnButton() {

        countryList = (Spinner) findViewById(R.id.spinnerCountry);
        sportList=(Spinner)findViewById(R.id.spinnerSport);
        btnSubmit = (Button) findViewById(R.id.buttonSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,
                        "On Button Click : " +
                                "\n" + String.valueOf(countryList.getSelectedItem())+String.valueOf(sportList.getSelectedItem()),
                        Toast.LENGTH_LONG).show();
            }

        });

    }

}
