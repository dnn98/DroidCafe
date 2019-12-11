package com.example.droidcafe;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DonutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut);
    }

    public void doRadio1 (View view){
        Toast toast1 = Toast.makeText(getApplicationContext(),"Chosen: Same day messenger service", Toast.LENGTH_SHORT);
        toast1.show();
    }
    public void doRadio2 (View view){
        Toast toast2 = Toast.makeText(getApplicationContext(),"Chosen: Next day ground delievery", Toast.LENGTH_SHORT);
        toast2.show();
    }
    public void doRadio3 (View view){
        Toast toast3 = Toast.makeText(getApplicationContext(),"Chosen: Pick up", Toast.LENGTH_SHORT);
        toast3.show();
    }
}
