package com.example.chemassist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ReactionsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reactions);

        Button alcaniButton = findViewById(R.id.alcani_button);
        Button alcheneButton = findViewById(R.id.alchene_button);
        Button alchineButton = findViewById(R.id.alchine_button);
        Button areneButton = findViewById(R.id.arene_button);
        Button alcooliButton = findViewById(R.id.alcooli_button);
        Button amineButton = findViewById(R.id.amine_button);
        Button aldehideButton = findViewById(R.id.aldehide_button);
        Button aciziButton = findViewById(R.id.acizi_button);

        alcaniButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(AlcaniActivity.class);
            }
        });

        alcheneButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(AlcheneActivity.class);
            }
        });

        alchineButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(AlchineActivity.class);
            }
        });

        areneButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(AreneActivity.class);
            }
        });

        alcooliButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(AlcooliActivity.class);
            }
        });

        amineButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(AmineActivity.class);
            }
        });

        aldehideButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(AldehideActivity.class);
            }
        });

        aciziButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(AciziActivity.class);
            }
        });
    }

    private void startActivity (Class<?> cls)
    {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
