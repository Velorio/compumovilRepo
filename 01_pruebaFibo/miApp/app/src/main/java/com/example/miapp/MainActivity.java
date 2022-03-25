package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonFibo;
    EditText editTextFibo;
    ArrayList<Integer> fiboList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fiboList = new ArrayList<Integer>();
        buttonFibo = findViewById(R.id.buttonFibo);
        editTextFibo = findViewById(R.id.editTextTextPersonName);

        buttonFibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextFibo.getText().toString().equals("")){
                    editTextFibo.setText("1");
                    fiboList.add(1);
                }
                else{
                    int next =0;
                    if(fiboList.size()==1){
                        next = 1;
                    }else{
                        next = fiboList.get(fiboList.size()-1)+fiboList.get(fiboList.size()-2);
                    }
                    fiboList.add(next);
                    editTextFibo.setText(editTextFibo.getText().toString()+" "+next);
                }
            }
        });

    }

    public void onClickFibo(View v){
        if(editTextFibo.getText().toString().equals("")){
            editTextFibo.setText("1");
            fiboList.add(1);
        }
        else{
            int next =0;
            for(Integer i: fiboList){
                next += i;
            }
            fiboList.add(next);
            editTextFibo.setText(editTextFibo.getText().toString()+" "+next);
        }
    }
}