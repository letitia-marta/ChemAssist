package com.example.chemassist;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BalancerActivity extends AppCompatActivity
{
    private EditText reactantsInput;
    private EditText productsInput;
    private TextView balancedEquation;
    private static final String TAG = "BalancerActivity";

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balancer);

        reactantsInput = findViewById(R.id.reactants_input);
        productsInput = findViewById(R.id.products_input);
        balancedEquation = findViewById(R.id.balanced_equation);
        Button balanceButton = findViewById(R.id.balance_button);

        balanceButton.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                try
                {
                    String reactants = reactantsInput.getText().toString();
                    String products = productsInput.getText().toString();
                    String result = ChemicalBalancer.balanceChemicalEquation(reactants, products);
                    balancedEquation.setText(result);
                }
                catch (Exception e)
                {
                    Log.e(TAG, "A fost întâmpinată o eroare: ", e);
                    balancedEquation.setText("Eroare: " + e.getMessage());
                }
            }
        });
    }
}
