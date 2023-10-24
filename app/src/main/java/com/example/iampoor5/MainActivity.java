/*
AUTHOR: Varun
DATE: 10/23/2023
ASSIGNMENT: I am poor pt 5
 */

package com.example.iampoor5;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    TextView change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        change = findViewById(R.id.Change);
        button.setOnClickListener(view -> verifyRichness(button));
        button2.setOnClickListener(view -> verifyRichness(button2));


    }



    public void verifyRichness(Button button){
        if(button.getText().toString().equals("I am Rich")){
            change.setText("I AM RICH");
        }
        else{
            change.setText("I AM POOR");
        }

    }




}