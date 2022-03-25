package com.example.taller1_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonFibo, buttonFactorial, buttonPaises;
    EditText editTextFibo;
    Spinner spinnerFact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFibo = findViewById(R.id.buttonFibo);
        buttonFactorial = findViewById(R.id.buttonFactorial);
        buttonPaises = findViewById(R.id.buttonPaises);
        editTextFibo = findViewById(R.id.editTextFibo);
        spinnerFact = findViewById(R.id.spinner);
        ArrayList<Integer> valoresSpinner = valoresSpinner();
        spinnerFact.setAdapter(new ArrayAdapter<Integer>(getApplicationContext(), android.R.layout.simple_spinner_item, valoresSpinner));


    }

    public void lanzarFibonacci(View view){
        if(editTextFibo.getText().toString().equals("")){
           Toast toast = Toast.makeText(getApplicationContext(),"Ingrese un valor", Toast.LENGTH_SHORT);
           toast.show();
        }
        else{
            Intent intent = new Intent(view.getContext(), FiboActivity.class);
            intent.putExtra("posiciones",editTextFibo.getText().toString());
            startActivity(intent);
        }
    }

    private ArrayList<Integer> valoresSpinner(){
        ArrayList<Integer> valores = new ArrayList<>();
        for(int i=1; i<16; i++){
            valores.add(i);
        }
        return  valores;
    }
}