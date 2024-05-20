package com.example.chemassist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        Button demoButton = findViewById (R.id.demo_button);
        demoButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(MainActivity.this, DemoActivity.class);
                startActivity (intent);
            }
        });

        Button balancerButton = findViewById (R.id.balancer_button);
        balancerButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(MainActivity.this, BalancerActivity.class);
                startActivity (intent);
            }
        });

        Button reactionsButton = findViewById (R.id.reactions_button);
        reactionsButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(MainActivity.this, ReactionsActivity.class);
                startActivity (intent);
            }
        });

        Button tableButton = findViewById (R.id.table_button);
        tableButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                startActivity (intent);
            }
        });
    }
}
