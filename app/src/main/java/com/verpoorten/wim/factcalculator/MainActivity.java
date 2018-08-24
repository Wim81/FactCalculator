package com.verpoorten.wim.factcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //region Button & Text initiation
    private Button input_0;
    private Button input_1;
    private Button input_2;
    private Button input_3;
    private Button input_4;
    private Button input_5;
    private Button input_6;
    private Button input_7;
    private Button input_8;
    private Button input_9;
    private Button input_add;
    private Button input_subtract;
    private Button input_multiply;
    private Button input_divide;
    private Button input_decimal;
    private Button input_positive_negative;
    private Button input_equals;
    private Button input_back;
    private EditText text_calculation;
    private EditText text_api;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("FactCalculator");

        Toast.makeText(MainActivity.this, "FactCalculator initaiting, oh Master...", Toast.LENGTH_LONG).show();

        text_calculation = (EditText) findViewById(R.id.text_calculation);

        input_0 = (Button) findViewById(R.id.button_0);
        input_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "0";
                /*Toast.makeText(MainActivity.this, new_value, Toast.LENGTH_LONG).show();*/
                text_calculation.setText(new_value);
            }
        });

    }
}
