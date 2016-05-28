package com.example.user.mycalc;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText etVal1;
    EditText etVal2;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("==계산기 프로그램==");

        etVal1 = (EditText) findViewById(R.id.etVal1);
        etVal2 = (EditText) findViewById(R.id.etVal2);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);

        tvResult = (TextView) findViewById(R.id.tvResult);

        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                 tvResult.setText( (Integer.parseInt(etVal1.getText().toString()) + Integer.parseInt(etVal2.getText().toString()))+"" );
                return false;
            }
        });

        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                tvResult.setText( (Integer.parseInt(etVal1.getText().toString()) - Integer.parseInt(etVal2.getText().toString()))+"" );
                return false;
            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                tvResult.setText( (Integer.parseInt(etVal1.getText().toString()) * Integer.parseInt(etVal2.getText().toString()))+"" );
                return false;
            }
        });

        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                tvResult.setText( (Integer.parseInt(etVal1.getText().toString()) / Integer.parseInt(etVal2.getText().toString()))+"" );
                return false;
            }
        });

        btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                tvResult.setText( (Integer.parseInt(etVal1.getText().toString()) % Integer.parseInt(etVal2.getText().toString()))+"" );
                return false;
            }
        });


    }

}
