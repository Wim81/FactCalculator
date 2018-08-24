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
    private Button input_clear;
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

        // when the 0 button gets clicked
        input_0 = (Button) findViewById(R.id.button_0);
        input_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "0";
                text_calculation.setText(new_value);
            }
        });

        // when the 1 button gets clicked
        input_1 = (Button) findViewById(R.id.button_1);
        input_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "1";
                text_calculation.setText(new_value);
            }
        });

        // when the 2 button gets clicked
        input_2 = (Button) findViewById(R.id.button_2);
        input_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "2";
                text_calculation.setText(new_value);
            }
        });

        // when the 3 button gets clicked
        input_3 = (Button) findViewById(R.id.button_3);
        input_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "3";
                text_calculation.setText(new_value);
            }
        });

        // when the 4 button gets clicked
        input_4 = (Button) findViewById(R.id.button_4);
        input_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "4";
                text_calculation.setText(new_value);
            }
        });

        // when the 5 button gets clicked
        input_5 = (Button) findViewById(R.id.button_5);
        input_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "5";
                text_calculation.setText(new_value);
            }
        });

        // when the 6 button gets clicked
        input_6 = (Button) findViewById(R.id.button_6);
        input_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "6";
                text_calculation.setText(new_value);
            }
        });

        // when the 7 button gets clicked
        input_7 = (Button) findViewById(R.id.button_7);
        input_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "7";
                text_calculation.setText(new_value);
            }
        });

        // when the 8 button gets clicked
        input_8 = (Button) findViewById(R.id.button_8);
        input_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "8";
                text_calculation.setText(new_value);
            }
        });

        // when the 9 button gets clicked
        input_9 = (Button) findViewById(R.id.button_9);
        input_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                final String new_value = init_value + "9";
                text_calculation.setText(new_value);
            }
        });

        // when the decimal button gets clicked
        input_decimal = (Button) findViewById(R.id.button_decimal);
        input_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                String new_value = init_value;

                if (init_value.contains("+") ) {
                    String getallen[] = init_value.split("\\+");
                    String getal2 =  ( getallen[1] );
                    if (getal2.contains(".") ) {
                        //nothing happens, because there already is a decimal point in the last number
                    } else {
                        new_value = init_value + ".";
                    }
                } else if (init_value.contains("-") ) {
                    String getallen[] = init_value.split("-");
                    String getal2 =  ( getallen[1] );
                    if (getal2.contains(".") ) {
                        //nothing happens, because there already is a decimal point in the last number
                    } else {
                        new_value = init_value + ".";
                    }
                } else if (init_value.contains("x") ) {
                    String getallen[] = init_value.split("x");
                    String getal2 =  ( getallen[1] );
                    if (getal2.contains(".") ) {
                        //nothing happens, because there already is a decimal point in the last number
                    } else {
                        new_value = init_value + ".";
                    }
                } else if (init_value.contains(":") ) {
                    String getallen[] = init_value.split(":");
                    String getal2 =  ( getallen[1] );
                    if (getal2.contains(".") ) {
                        //nothing happens, because there already is a decimal point in the last number
                    } else {
                        new_value = init_value + ".";
                    }
                } else if ( init_value.contains(".") ) {
                    //nothing happens, because there already is a decimal point in the one number which is on display
                } else {
                    new_value = init_value + ".";
                }

                text_calculation.setText(new_value);
            }
        });

        // when the + button gets clicked
        input_add = (Button) findViewById(R.id.button_add);
        input_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst) + "+";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("-") && init_value.indexOf("-") != 0 ) {

                    String getallen[] = init_value.split("-");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 - getal2;
                    String new_value = Float.toString(uitkomst) + "+";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst) + "+";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 / getal2;
                    String new_value = Float.toString(uitkomst) + "+";
                    text_calculation.setText(new_value);

                } else {
                    final String new_value = init_value + "+";
                    text_calculation.setText(new_value);
                }
            }
        });

        // when the - button gets clicked
        input_subtract = (Button) findViewById(R.id.button_subtract);
        input_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst) + "-";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("-") && init_value.indexOf("-") != 0 ) {

                    String getallen[] = init_value.split("-");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 - getal2;
                    String new_value = Float.toString(uitkomst) + "-";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst) + "-";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 / getal2;
                    String new_value = Float.toString(uitkomst) + "-";
                    text_calculation.setText(new_value);

                } else {
                    final String new_value = init_value + "-";
                    text_calculation.setText(new_value);
                }
            }
        });

        // when the x button gets clicked
        input_multiply = (Button) findViewById(R.id.button_multiply);
        input_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst) + "x";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("-") && init_value.indexOf("-") != 0 ) {

                    String getallen[] = init_value.split("-");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 - getal2;
                    String new_value = Float.toString(uitkomst) + "x";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst) + "x";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 / getal2;
                    String new_value = Float.toString(uitkomst) + "x";
                    text_calculation.setText(new_value);

                } else {
                    final String new_value = init_value + "x";
                    text_calculation.setText(new_value);
                }
            }
        });

        // when the : button gets clicked
        input_divide = (Button) findViewById(R.id.button_divide);
        input_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst) + ":";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("-") && init_value.indexOf("-") != 0 ) {

                    String getallen[] = init_value.split("-");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 - getal2;
                    String new_value = Float.toString(uitkomst) + ":";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst) + ":";
                    text_calculation.setText(new_value);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 / getal2;
                    String new_value = Float.toString(uitkomst) + ":";
                    text_calculation.setText(new_value);

                } else {
                    final String new_value = init_value + ":";
                    text_calculation.setText(new_value);
                }
            }
        });

        // when the = button gets clicked
        input_equals = (Button) findViewById(R.id.button_equals);
        input_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String init_value = text_calculation.getText().toString();
                if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst);
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("-") && init_value.indexOf("-") != 0 ) {

                    String getallen[] = init_value.split("-");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 - getal2;
                    String new_value = Float.toString(uitkomst);
                    text_calculation.setText(new_value);

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst);
                    text_calculation.setText(new_value);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 / getal2;
                    String new_value = Float.toString(uitkomst);
                    text_calculation.setText(new_value);

                } else {
                    final String new_value = init_value;
                    text_calculation.setText(new_value);
                }
            }
        });

        // when the C button gets clicked
        input_clear = (Button) findViewById(R.id.button_clear);
        input_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_calculation.setText("0");
            }
        });

    }
}
