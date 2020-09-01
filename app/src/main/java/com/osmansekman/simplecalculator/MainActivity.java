package com.osmansekman.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView sonuc1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         number1 = findViewById(R.id.number1);
         number2 = findViewById(R.id.number2);
         sonuc1 = findViewById(R.id.sonuc1);
    }

    public void sum(View view){
        int number1Text = Integer.parseInt (number1.getText().toString());
        int number2Text = Integer.parseInt (number2.getText().toString());
        int result = number1Text+ number2Text;
        sonuc1.setText("Result : "+ result);
    }
    public void cikarma(View view){

        int number1Text = Integer.parseInt (number1.getText().toString());
        int number2Text = Integer.parseInt (number2.getText().toString());
        int result = number1Text- number2Text;
        sonuc1.setText("Result : "+ result);
    }
    public void carpma(View view){

        int number1Text = Integer.parseInt (number1.getText().toString());
        int number2Text = Integer.parseInt (number2.getText().toString());
        int result = number1Text* number2Text;
        sonuc1.setText("Result : "+ result);

    }
    public void bolme(View view){

        int number1Text = Integer.parseInt (number1.getText().toString());
        int number2Text = Integer.parseInt (number2.getText().toString());
        int result = number1Text/ number2Text;
        sonuc1.setText("Result : "+ result);

    }
}