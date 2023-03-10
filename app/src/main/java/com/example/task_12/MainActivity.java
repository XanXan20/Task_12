package com.example.task_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText arg1;
    EditText arg2;
    Button button;
    TextView answ1;
    TextView answ2;
    TextView answ3;
    TextView answ4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arg1 = findViewById(R.id.agr_1);
        arg2 = findViewById(R.id.arg_2);
        button = findViewById(R.id.button);
        answ1 = findViewById(R.id.answ_1);
        answ2 = findViewById(R.id.answ_2);
        answ3 = findViewById(R.id.answ_3);
        answ4 = findViewById(R.id.answ_4);
    }

    public void click(View view) {
        double a1 = Integer.parseInt(arg1.getText().toString());
        double a2 = Integer.parseInt(arg2.getText().toString());

        try{

            answ1.setText("Ср. арифметич.: " + ((a1 + a2) / 2));
            answ2.setText("Ср. геометрич.: " + ((a1 * a2) / 2));
            answ3.setText("Ср. квадратич.: " + (Math.sqrt((Math.pow(a1, 2) + Math.pow(a2, 2)) / 2)));
            answ4.setText("Ср. гармонич.: " + (2 / (1/a1 + 1/a2)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}