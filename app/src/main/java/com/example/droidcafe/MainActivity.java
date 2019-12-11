package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doDonut(View view){
        Toast toast1 = Toast.makeText(getApplicationContext(),"You ordered a donut.", Toast.LENGTH_SHORT);
        toast1.show();
        Intent intent = new Intent(this, DonutActivity.class);
        startActivity(intent);
    }
    public void doIcecream(View view){
        Toast toast2 = Toast.makeText(getApplicationContext(),"You ordered an ice cream sandwich.", Toast.LENGTH_SHORT);
        toast2.show();
        Intent intent = new Intent(this, DonutActivity.class);
        startActivity(intent);
    }
    public void doYogurt(View view){
        Toast toast3 = Toast.makeText(getApplicationContext(),"You ordered a yogurt.", Toast.LENGTH_SHORT);
        toast3.show();
        Intent intent = new Intent(this, DonutActivity.class);
        startActivity(intent);
    }
}
