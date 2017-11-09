package com.fju.gauss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gauss (View view){
        int ran = new Random().nextInt(10)+1;
        EditText edNumber = (EditText) findViewById(R.id.ed_number);
        int number = Integer.parseInt(edNumber.getText().toString());
        if (number < ran){
            System.out.print("太小了");
        }else if (number > ran){
            System.out.print("太大了");
        }else {
            System.out.print("恭喜答對");
        }
    }
}
