package com.verpoorten.wim.factcalculator;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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
    ProgressDialog pd;
    //endregion

    // function for updateing text_calculation
    public void updateTextCalculation(String new_value) {
        text_calculation.setText(new_value);
        if(new_value.length() > 24) {
            text_calculation.setTextSize(20);
        } else if(new_value.length() > 15) {
            text_calculation.setTextSize(30);
        } else if (new_value.length() > 7) {
            text_calculation.setTextSize(50);
        } else {
            text_calculation.setTextSize(100);
        }
    }

    // function for checking internet connection & fetching API data
    public void checkInternetAndFetchApiData(float uitkomst) {
        double result_converted_floored = Math.floor(uitkomst);
        int result_integer = (int) result_converted_floored;
        String result_api = Integer.toString(result_integer);
        String api_call = "http://numbersapi.com/" + result_api;
        boolean internet_connection = checkInternetConnection();
        if( internet_connection == true ) {
            new JsonTask().execute(api_call);
        } else {
            String no_internet_text = "We can only offer you useless facts when you have an internet connection...";
            text_api.setText(no_internet_text);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("FactCalculator");

        // initialize buttons & text fields
        input_0 = (Button) findViewById(R.id.button_0);
        input_1 = (Button) findViewById(R.id.button_1);
        input_2 = (Button) findViewById(R.id.button_2);
        input_3 = (Button) findViewById(R.id.button_3);
        input_4 = (Button) findViewById(R.id.button_4);
        input_5 = (Button) findViewById(R.id.button_5);
        input_6 = (Button) findViewById(R.id.button_6);
        input_7 = (Button) findViewById(R.id.button_7);
        input_8 = (Button) findViewById(R.id.button_8);
        input_9 = (Button) findViewById(R.id.button_9);
        input_decimal = (Button) findViewById(R.id.button_decimal);
        input_positive_negative = (Button) findViewById(R.id.button_positive_negative);
        input_add = (Button) findViewById(R.id.button_add);
        input_subtract = (Button) findViewById(R.id.button_subtract);
        input_multiply = (Button) findViewById(R.id.button_multiply);
        input_divide = (Button) findViewById(R.id.button_divide);
        input_equals = (Button) findViewById(R.id.button_equals);
        input_clear = (Button) findViewById(R.id.button_clear);
        text_calculation = (EditText) findViewById(R.id.text_calculation);
        text_api = (EditText) findViewById(R.id.text_api);

        //font
        Typeface calcFont = Typeface.createFromAsset(getAssets(), "fonts/Baby-Universe.ttf");
        Typeface calcFontAPI = Typeface.createFromAsset(getAssets(), "fonts/berlin_sans.TTF");
        Typeface calcFontScreen = Typeface.createFromAsset(getAssets(), "fonts/digital_7_mono.ttf");

        input_0.setTypeface(calcFont);
        input_1.setTypeface(calcFont);
        input_2.setTypeface(calcFont);
        input_3.setTypeface(calcFont);
        input_4.setTypeface(calcFont);
        input_5.setTypeface(calcFont);
        input_6.setTypeface(calcFont);
        input_7.setTypeface(calcFont);
        input_8.setTypeface(calcFont);
        input_9.setTypeface(calcFont);
        input_decimal.setTypeface(calcFont);
        input_positive_negative.setTypeface(calcFont);
        input_add.setTypeface(calcFont);
        input_subtract.setTypeface(calcFont);
        input_multiply.setTypeface(calcFont);
        input_divide.setTypeface(calcFont);
        input_equals.setTypeface(calcFont);
        input_clear.setTypeface(calcFont);
        text_calculation.setTypeface(calcFontScreen);
        text_api.setTypeface(calcFontAPI);

        //init message
        Toast.makeText(MainActivity.this, "FactCalculator initiating, oh Master...", Toast.LENGTH_LONG).show();




        // when the 0 button gets clicked
        input_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                String new_value = init_value + "0";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the 1 button gets clicked
        input_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.equals("0")) {
                    init_value = "";
                }
                String new_value = init_value + "1";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the 2 button gets clicked
        input_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.equals("0")) {
                    init_value = "";
                }
                String new_value = init_value + "2";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the 3 button gets clicked
        input_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.equals("0")) {
                    init_value = "";
                }
                String new_value = init_value + "3";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the 4 button gets clicked
        input_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.equals("0")) {
                    init_value = "";
                }
                String new_value = init_value + "4";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the 5 button gets clicked
        input_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.equals("0")) {
                    init_value = "";
                }
                String new_value = init_value + "5";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the 6 button gets clicked
        input_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.equals("0")) {
                    init_value = "";
                }
                String new_value = init_value + "6";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the 7 button gets clicked
        input_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.equals("0")) {
                    init_value = "";
                }
                String new_value = init_value + "7";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the 8 button gets clicked
        input_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.equals("0")) {
                    init_value = "";
                }
                String new_value = init_value + "8";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the 9 button gets clicked
        input_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.equals("0")) {
                    init_value = "";
                }
                String new_value = init_value + "9";
                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the decimal button gets clicked
        input_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                String new_value = init_value;

                if (init_value.substring(init_value.length()-1).equals("+") ||
                        init_value.substring(init_value.length()-1).equals("-") ||
                        init_value.substring(init_value.length()-1).equals("x") ||
                        init_value.substring(init_value.length()-1).equals(":")) {
                    // if decimal is entered right after an operator, we add a leading zero in order to keep the app from crashing
                    new_value = init_value + "0.";

                } else if (init_value.contains("+") ) {
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

                updateTextCalculation(new_value);
                text_api.setText("");
            }
        });

        // when the positive/negative button gets clicked
        input_positive_negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();

                if(init_value.substring(init_value.length()-1).equals("+") ||
                        init_value.substring(init_value.length()-1).equals("-") ||
                        init_value.substring(init_value.length()-1).equals("x") ||
                        init_value.substring(init_value.length()-1).equals(":")) {
                    // nothing happens if +/- button gets clicked but the last character is an operator
                } else if ( init_value.contains("+") && !init_value.substring(init_value.length()-1).equals("+") ) {

                    String getallen[] = init_value.split("\\+");
                    if (getallen[1].substring(0,1).equals("-")) {
                        getallen[1] = getallen[1].substring(1);
                        String new_value = getallen[0] + "+" + getallen[1];
                        updateTextCalculation(new_value);
                    } else {
                        getallen[1] = "-" + getallen[1];
                        String new_value = getallen[0] + "+" + getallen[1];
                        updateTextCalculation(new_value);
                    }

                } else if ( init_value.contains("-") && !init_value.substring(init_value.length()-1).equals("-") && init_value.indexOf("+") < 0 && init_value.indexOf("x") < 0 && init_value.indexOf(":") < 0 ) {

                    if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is slechts 1 min teken en dat staat vooraan
                        String new_value = init_value.substring(1);
                        updateTextCalculation(new_value);
                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens en 1 staat vooraan
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-");
                        getallen[0] = "-" + getallen[0];
                        getallen[1] = "-" + getallen[1];
                        String new_value = getallen[0] + "-" + getallen[1];
                        updateTextCalculation(new_value);
                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 3) ) {
                        // er zijn 3 min tekens en
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-", 2);
                        getallen[0] = "-" + getallen[0];
                        getallen[1] = getallen[1].substring(1);
                        String new_value = getallen[0] + "-" + getallen[1];
                        updateTextCalculation(new_value);
                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens maar geen staat vooraan
                        String getallen[] = init_value.split("-", 2);
                        getallen[1] = getallen[1].substring(1);
                        String new_value = getallen[0] + "-" + getallen[1];
                        updateTextCalculation(new_value);
                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is 1 min teken maar niet vooraan
                        String getallen[] = init_value.split("-");
                        getallen[1] = "-" + getallen[1];
                        String new_value = getallen[0] + "-" + getallen[1];
                        updateTextCalculation(new_value);
                    } else {
                       // no other options
                    }

                } else if ( init_value.contains("x") && !init_value.substring(init_value.length()-1).equals("x") ) {

                    String getallen[] = init_value.split("x");
                    if (getallen[1].substring(0,1).equals("-")) {
                        getallen[1] = getallen[1].substring(1);
                        String new_value = getallen[0] + "x" + getallen[1];
                        updateTextCalculation(new_value);
                    } else {
                        getallen[1] = "-" + getallen[1];
                        String new_value = getallen[0] + "x" + getallen[1];
                        updateTextCalculation(new_value);
                    }

                } else if ( init_value.contains(":") && !init_value.substring(init_value.length()-1).equals(":") ) {

                    String getallen[] = init_value.split(":");
                    if (getallen[1].substring(0,1).equals("-")) {
                        getallen[1] = getallen[1].substring(1);
                        String new_value = getallen[0] + ":" + getallen[1];
                        updateTextCalculation(new_value);
                    } else {
                        getallen[1] = "-" + getallen[1];
                        String new_value = getallen[0] + ":" + getallen[1];
                        updateTextCalculation(new_value);
                    }

                } else {
                    if (init_value.substring(0,1).equals("-")) {
                        String new_value = init_value.substring(1);
                        updateTextCalculation(new_value);
                    } else {
                        String new_value = "-" + init_value;
                        updateTextCalculation(new_value);
                    }
                }
                text_api.setText("");
            }
        });

        // when the + button gets clicked
        input_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.substring(init_value.length()-1).equals("+") || init_value.substring(init_value.length()-1).equals("-") ||
                        init_value.substring(init_value.length()-1).equals("x") || init_value.substring(init_value.length()-1).equals(":")) {
                    Toast.makeText(MainActivity.this, "That would not make sense, now would it?", Toast.LENGTH_SHORT).show();
                    return;
                } else if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst) + "+";
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-3).equals(".0+") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + "+";
                    }
                    updateTextCalculation(new_value);
                    checkInternetAndFetchApiData(uitkomst);

                } else if ( init_value.contains("-") && !init_value.substring(init_value.length()-1).equals("-") && init_value.indexOf("+") < 0 && init_value.indexOf("x") < 0 && init_value.indexOf(":") < 0 ) {

                    if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is slechts 1 min teken en dat staat vooraan
                        String new_value =  init_value + "+";
                        updateTextCalculation(new_value);
                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens en 1 staat vooraan
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-");
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "+";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0+") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "+";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 3) ) {
                        // er zijn 3 min tekens
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "+";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0+") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "+";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens maar geen staat vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "+";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0+") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "+";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is 1 min teken maar niet vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "+";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0+") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "+";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else {
                        // no other options
                    }

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst) + "+";
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-3).equals(".0+") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + "+";
                    }
                    updateTextCalculation(new_value);
                    checkInternetAndFetchApiData(uitkomst);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    if (getal2 == 0) {
                        Toast.makeText(MainActivity.this, "Division by zero? I don't think so, amigo!", Toast.LENGTH_SHORT).show();
                    } else {
                        float uitkomst = getal1 / getal2;
                        String new_value = Float.toString(uitkomst) + "+";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0+") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "+";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);
                    }

                } else {
                    String new_value = init_value + "+";
                    if ( new_value.length() >= 3 && new_value.substring(new_value.length()-3).equals(".0+") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + "+";
                    }
                    updateTextCalculation(new_value);
                    text_api.setText("");
                }
            }
        });

        // when the - button gets clicked
        input_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.substring(init_value.length()-1).equals("+") || init_value.substring(init_value.length()-1).equals("-") ||
                        init_value.substring(init_value.length()-1).equals("x") || init_value.substring(init_value.length()-1).equals(":")) {
                    Toast.makeText(MainActivity.this, "That would not make sense, now would it?", Toast.LENGTH_SHORT).show();
                    return;
                } else if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst) + "-";
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-3).equals(".0-") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + "-";
                    }
                    updateTextCalculation(new_value);
                    checkInternetAndFetchApiData(uitkomst);

                } else if ( init_value.contains("-") && !init_value.substring(init_value.length()-1).equals("-") && init_value.indexOf("+") < 0 && init_value.indexOf("x") < 0 && init_value.indexOf(":") < 0 ) {

                    if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is slechts 1 min teken en dat staat vooraan
                        String new_value =  init_value + "-";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0-") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "-";
                        }
                        updateTextCalculation(new_value);
                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens en 1 staat vooraan
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-");
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "-";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0-") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "-";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 3) ) {
                        // er zijn 3 min tekens
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "-";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0-") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "-";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens maar geen staat vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "-";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0-") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "-";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is 1 min teken maar niet vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "-";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0-") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "-";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else {
                        // no other options
                    }

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst) + "-";
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-3).equals(".0-") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + "-";
                    }
                    updateTextCalculation(new_value);
                    checkInternetAndFetchApiData(uitkomst);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    if (getal2 == 0) {
                        Toast.makeText(MainActivity.this, "Division by zero? I don't think so, amigo!", Toast.LENGTH_SHORT).show();
                    } else {
                        float uitkomst = getal1 / getal2;
                        String new_value = Float.toString(uitkomst) + "-";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0-") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "-";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);
                    }

                } else {
                    String new_value = init_value + "-";
                    // getting rid of decimal where not needed
                    if ( new_value.length() >= 3 && new_value.substring(new_value.length()-3).equals(".0-") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + "-";
                    }
                    updateTextCalculation(new_value);
                    text_api.setText("");
                }
            }
        });

        // when the x button gets clicked
        input_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.substring(init_value.length()-1).equals("+") || init_value.substring(init_value.length()-1).equals("-") ||
                        init_value.substring(init_value.length()-1).equals("x") || init_value.substring(init_value.length()-1).equals(":")) {
                    Toast.makeText(MainActivity.this, "That would not make sense, now would it?", Toast.LENGTH_SHORT).show();
                    return;
                } else if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst) + "x";
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-3).equals(".0x") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + "x";
                    }
                    updateTextCalculation(new_value);
                    checkInternetAndFetchApiData(uitkomst);

                } else if ( init_value.contains("-") && !init_value.substring(init_value.length()-1).equals("-") && init_value.indexOf("+") < 0 && init_value.indexOf("x") < 0 && init_value.indexOf(":") < 0 ) {

                    if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is slechts 1 min teken en dat staat vooraan
                        String new_value =  init_value + "x";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0x") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "x";
                        }
                        updateTextCalculation(new_value);
                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens en 1 staat vooraan
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-");
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "x";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0x") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "x";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 3) ) {
                        // er zijn 3 min tekens
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "x";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0x") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "x";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens maar geen staat vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "x";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0x") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "x";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is 1 min teken maar niet vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + "x";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0x") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "x";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);
                    } else {
                        // no other options
                    }

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst) + "x";
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-3).equals(".0x") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + "x";
                    }
                    updateTextCalculation(new_value);
                    checkInternetAndFetchApiData(uitkomst);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    if (getal2 == 0) {
                        Toast.makeText(MainActivity.this, "Division by zero? I don't think so, amigo!", Toast.LENGTH_SHORT).show();
                    } else {
                        float uitkomst = getal1 / getal2;
                        String new_value = Float.toString(uitkomst) + "x";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0x") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + "x";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);
                    }
                } else {
                    String new_value = init_value + "x";
                    // getting rid of decimal where not needed
                    if ( new_value.length() >= 3 && new_value.substring(new_value.length()-3).equals(".0x") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + "x";
                    }
                    updateTextCalculation(new_value);
                    text_api.setText("");
                }
            }
        });

        // when the : button gets clicked
        input_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.substring(init_value.length()-1).equals("+") || init_value.substring(init_value.length()-1).equals("-") ||
                        init_value.substring(init_value.length()-1).equals("x") || init_value.substring(init_value.length()-1).equals(":")) {
                    Toast.makeText(MainActivity.this, "That would not make sense, now would it?", Toast.LENGTH_SHORT).show();
                    return;
                } else if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst) + ":";
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-3).equals(".0:") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + ":";
                    }
                    updateTextCalculation(new_value);
                    checkInternetAndFetchApiData(uitkomst);

                } else if ( init_value.contains("-") && !init_value.substring(init_value.length()-1).equals("-") && init_value.indexOf("+") < 0 && init_value.indexOf("x") < 0 && init_value.indexOf(":") < 0 ) {

                    if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is slechts 1 min teken en dat staat vooraan
                        String new_value =  init_value + ":";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0:") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + ":";
                        }
                        updateTextCalculation(new_value);
                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens en 1 staat vooraan
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-");
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + ":";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0:") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + ":";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 3) ) {
                        // er zijn 3 min tekens
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + ":";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0:") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + ":";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens maar geen staat vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + ":";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0:") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + ":";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is 1 min teken maar niet vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst) + ":";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0:") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + ":";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);

                    } else {
                        // no other options
                    }

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst) + ":";
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-3).equals(".0:") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + ":";
                    }
                    updateTextCalculation(new_value);
                    checkInternetAndFetchApiData(uitkomst);

                } else if ( init_value.contains(":") ) {

                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    if (getal2 == 0) {
                        Toast.makeText(MainActivity.this, "Division by zero? I don't think so, amigo!", Toast.LENGTH_SHORT).show();
                    } else {
                        float uitkomst = getal1 / getal2;
                        String new_value = Float.toString(uitkomst) + ":";
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-3).equals(".0:") ) {
                            new_value = new_value.substring(0, new_value.length()-3) + ":";
                        }
                        updateTextCalculation(new_value);
                        checkInternetAndFetchApiData(uitkomst);
                    }

                } else {
                    String new_value = init_value + ":";
                    // getting rid of decimal where not needed
                    if ( new_value.length() >= 3 && new_value.substring(new_value.length()-3).equals(".0:") ) {
                        new_value = new_value.substring(0, new_value.length()-3) + ":";
                    }
                    updateTextCalculation(new_value);
                    text_api.setText("");
                }
            }
        });

        // when the = button gets clicked
        input_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String init_value = text_calculation.getText().toString();
                if (init_value.substring(init_value.length()-1).equals("+") || init_value.substring(init_value.length()-1).equals("-") ||
                        init_value.substring(init_value.length()-1).equals("x") || init_value.substring(init_value.length()-1).equals(":")) {
                    Toast.makeText(MainActivity.this, "That would not make sense, now would it?", Toast.LENGTH_SHORT).show();
                    return;
                } else
                if (init_value.contains("+") ) {

                    String getallen[] = init_value.split("\\+");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 + getal2;
                    String new_value = Float.toString(uitkomst);
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-2).equals(".0") ) {
                        new_value = new_value.substring(0, new_value.length()-2);
                    }
                    updateTextCalculation(new_value);

                } else if ( init_value.contains("-") && !init_value.substring(init_value.length()-1).equals("-") && init_value.indexOf("+") < 0 && init_value.indexOf("x") < 0 && init_value.indexOf(":") < 0 ) {

                    if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is slechts 1 min teken en dat staat vooraan, dus geen actie want geen bewerking
                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens en 1 staat vooraan
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-");
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst);
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-2).equals(".0") ) {
                            new_value = new_value.substring(0, new_value.length()-2);
                        }
                        updateTextCalculation(new_value);
                    } else if ( init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 3) ) {
                        // er zijn 3 min tekens
                        init_value = init_value.substring(1);
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  0 - Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst);
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-2).equals(".0") ) {
                            new_value = new_value.substring(0, new_value.length()-2);
                        }
                        updateTextCalculation(new_value);
                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 2) ) {
                        // er zijn 2 min tekens maar geen staat vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst);
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-2).equals(".0") ) {
                            new_value = new_value.substring(0, new_value.length()-2);
                        }
                        updateTextCalculation(new_value);
                    } else if ( !init_value.substring(0,1).equals("-") && (init_value.length() - init_value.replace("-", "").length() == 1) ) {
                        // er is 1 min teken maar niet vooraan
                        String getallen[] = init_value.split("-", 2);
                        float getal1 =  Float.parseFloat( getallen[0] );
                        float getal2 =  Float.parseFloat( getallen[1] );
                        float uitkomst = getal1 - getal2;
                        String new_value =  Float.toString(uitkomst);
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-2).equals(".0") ) {
                            new_value = new_value.substring(0, new_value.length()-2);
                        }
                        updateTextCalculation(new_value);
                    } else {
                        // no other options
                    }

                } else if ( init_value.contains("x") ) {

                    String getallen[] = init_value.split("x");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    float uitkomst = getal1 * getal2;
                    String new_value = Float.toString(uitkomst);
                    // getting rid of decimal where not needed
                    if ( new_value.substring(new_value.length()-2).equals(".0") ) {
                        new_value = new_value.substring(0, new_value.length()-2);
                    }
                    updateTextCalculation(new_value);

                } else if ( init_value.contains(":") ) {
                    String getallen[] = init_value.split(":");
                    float getal1 =  Float.parseFloat( getallen[0] );
                    float getal2 =  Float.parseFloat( getallen[1] );
                    if (getal2 == 0) {
                        Toast.makeText(MainActivity.this, "Division by zero? I don't think so, amigo!", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        float uitkomst = getal1 / getal2;
                        String new_value = Float.toString(uitkomst);
                        // getting rid of decimal where not needed
                        if ( new_value.substring(new_value.length()-2).equals(".0") ) {
                            new_value = new_value.substring(0, new_value.length()-2);
                        }
                        updateTextCalculation(new_value);
                    }
                } else {
                    String new_value = init_value;
                    // getting rid of decimal where not needed
                    if ( new_value.length() >= 3 && new_value.substring(new_value.length()-2).equals(".0") ) {
                        new_value = new_value.substring(0, new_value.length()-2);
                    }
                    updateTextCalculation(new_value);
                }

                String result = text_calculation.getText().toString();
                float result_converted = Float.parseFloat(result);
                checkInternetAndFetchApiData(result_converted);

            }

        });

        // when the C button gets clicked
        input_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateTextCalculation("0");
                text_api.setText("");
            }
        });

    }


    // API stuff!
    private class JsonTask extends AsyncTask<String, String, String> {

        protected void onPreExecute() {
            super.onPreExecute();

            pd = new ProgressDialog(MainActivity.this);
            pd.setMessage("Hold on while we fetch some useless fact for you!");
            pd.setCancelable(false);
            pd.show();
        }

        protected String doInBackground(String... params) {


            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();


                InputStream stream = connection.getInputStream();

                reader = new BufferedReader(new InputStreamReader(stream));

                StringBuffer buffer = new StringBuffer();
                String line = "";

                while ((line = reader.readLine()) != null) {
                    buffer.append(line+"\n");
                    Log.d("Response: ", "> " + line);   //here u ll get whole response...... :-)

                }

                return buffer.toString();


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            if (pd.isShowing()){
                pd.dismiss();
            }
            // tiny correction because API result always includes a nasty enter at the end which is not needed
            result = result.substring(0, result.length()-1);
            text_api.setText(result);
        }
    }


    // check internet connection

    private boolean checkInternetConnection() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        // test for connection
        if (cm.getActiveNetworkInfo() != null
                && cm.getActiveNetworkInfo().isAvailable()
                && cm.getActiveNetworkInfo().isConnected()) {
            return true;
        } else {
            return false;
        }
    }
}


