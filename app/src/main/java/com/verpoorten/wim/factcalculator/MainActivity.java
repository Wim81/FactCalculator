package com.verpoorten.wim.factcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("FactCalculator");

        Toast.makeText(MainActivity.this, "FactCalculator initaiting, oh Master...", Toast.LENGTH_LONG).show();
    }
}
