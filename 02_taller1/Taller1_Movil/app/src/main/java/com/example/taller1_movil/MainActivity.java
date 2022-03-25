package com.example.taller1_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

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
}