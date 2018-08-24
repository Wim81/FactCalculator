package com.verpoorten.wim.factcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button input_0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("FactCalculator");

        Toast.makeText(MainActivity.this, "FactCalculator initaiting, oh Master...", Toast.LENGTH_LONG).show();


        input_0 = (Button) findViewById(R.id.button_0);
        input_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "you pressed the zero nothing nada key, dude!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
