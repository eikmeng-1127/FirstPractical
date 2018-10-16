package com.example.eikme.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main() function
        super.onCreate(savedInstanceState);
        //This method creates the UI
        //R = resource class
        //layout = design of UI (a folder)
        setContentView(R.layout.activity_main);

        TextView textViewMessage; //TextView is a class
                                  ///textViewMessage is an instance

        textViewMessage = findViewById(R.id.textViewMessage);

        textViewMessage.setText("Hello, Welcome to Planet Earth!");

    }

    public void showMessage(View view){
        Button showMessageButton = findViewById(R.id.showMessageButton);


    }
}
