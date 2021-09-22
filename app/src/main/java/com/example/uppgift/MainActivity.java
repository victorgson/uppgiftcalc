package com.example.uppgift;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt = (Button) findViewById(R.id.first_button);
        Button bt2 = (Button) findViewById(R.id.second_button);
        TextView result = (TextView) findViewById(R.id.result_text);

        EditText entryTal1 = (EditText) findViewById(R.id.first_number);
        EditText entryTal2 = (EditText) findViewById(R.id.second_number);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(entryTal1.getText().toString());
                int value2 = Integer.parseInt(entryTal2.getText().toString());
                result.setText("Result: " + String.valueOf(value + value2));
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(entryTal1.getText().toString());
                int value2 = Integer.parseInt(entryTal2.getText().toString());
                result.setText("Result: " + String.valueOf(value - value2));
            }
        });

        /*View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int value = Integer.parseInt(entryTal1.getText().toString());
                int value2 = Integer.parseInt(entryTal2.getText().toString());
                result.setText("Result: " + String.valueOf(value + value2));

            }
        };
        bt.setOnClickListener(listener);
    }*/


    }
}