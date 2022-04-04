package com.gold.ctech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        String[] type = new String[] {"AMD","Intel"};
        ArrayAdapter<String> adapter= new ArrayAdapter<>(
                this,
                R.layout.drop_down_item,
                type
        );
        AutoCompleteTextView autoCompleteTextView=findViewById(R.id.processor);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(calculator.this, autoCompleteTextView.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}