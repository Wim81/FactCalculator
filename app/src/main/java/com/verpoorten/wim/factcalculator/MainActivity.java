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
                text_calculation.setText(new_value);
            }
        });

        input_1 = (Button) findViewById(R.id.button_1);
        input_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "1";
                text_calculation.setText(new_value);
            }
        });

        input_2 = (Button) findViewById(R.id.button_2);
        input_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "2";
                text_calculation.setText(new_value);
            }
        });

        input_3 = (Button) findViewById(R.id.button_3);
        input_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "3";
                text_calculation.setText(new_value);
            }
        });

        input_4 = (Button) findViewById(R.id.button_4);
        input_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "4";
                text_calculation.setText(new_value);
            }
        });

        input_5 = (Button) findViewById(R.id.button_5);
        input_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "5";
                text_calculation.setText(new_value);
            }
        });

        input_6 = (Button) findViewById(R.id.button_6);
        input_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "6";
                text_calculation.setText(new_value);
            }
        });

        input_7 = (Button) findViewById(R.id.button_7);
        input_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "7";
                text_calculation.setText(new_value);
            }
        });

        input_8 = (Button) findViewById(R.id.button_8);
        input_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "8";
                text_calculation.setText(new_value);
            }
        });

        input_9 = (Button) findViewById(R.id.button_9);
        input_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "9";
                text_calculation.setText(new_value);
            }
        });

        input_add = (Button) findViewById(R.id.button_add);
        input_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    int getal1 =  Integer.parseInt( getallen[0] );
                    int getal2 =  Integer.parseInt( getallen[1] );
                    int uitkomst = getal1 + getal2;
                    String new_value = Integer.toString(uitkomst) + "+";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("-") ) {

                    String getallen[] = init_value.split("\\-");
                    int getal1 =  Integer.parseInt( getallen[0] );
                    int getal2 =  Integer.parseInt( getallen[1] );
                    int uitkomst = getal1 - getal2;
                    String new_value = Integer.toString(uitkomst) + "+";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("\\x");
                    int getal1 =  Integer.parseInt( getallen[0] );
                    int getal2 =  Integer.parseInt( getallen[1] );
                    int uitkomst = getal1 * getal2;
                    String new_value = Integer.toString(uitkomst) + "x";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split("\\:");
                    int getal1 =  Integer.parseInt( getallen[0] );
                    int getal2 =  Integer.parseInt( getallen[1] );
                    int uitkomst = getal1 / getal2;
                    String new_value = Integer.toString(uitkomst) + ":";
                    text_calculation.setText(new_value);

                } else {
                    final String new_value = init_value + "+";
                    text_calculation.setText(new_value);
                }
            }
        });

    }
}
