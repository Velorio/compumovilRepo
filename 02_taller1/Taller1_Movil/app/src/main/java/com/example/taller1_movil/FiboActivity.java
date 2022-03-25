package com.example.taller1_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FiboActivity extends AppCompatActivity {
    ImageButton imgButton;
    ListView listViewFibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibo);

        Intent intent = getIntent();
        String pos = intent.getStringExtra("posiciones");
        listViewFibo = findViewById(R.id.listViewFibo);

        int posiciones = Integer.parseInt(pos);
        ArrayList<Integer> fibonacci = new ArrayList<>();
        if(posiciones>0){
            for(int i=0; i<posiciones; i++){
                fibonacci.add(next(fibonacci));
            }
        }

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, fibonacci);
        listViewFibo.setAdapter(adapter);

    }

    private int next(ArrayList<Integer> f){
        if(f.size()==0 | f.size()==1){
            return 1;
        }else{
            return f.get(f.size()-2)+f.get(f.size()-1);
        }
    }

    public void wikiFibo(View view){
        Intent intent = new Intent(view.getContext(), wikiFibo.class);
        startActivity(intent);
    }

}