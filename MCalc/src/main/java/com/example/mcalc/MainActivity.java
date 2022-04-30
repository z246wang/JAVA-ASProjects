package com.example.mcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPaymentClicked(View view) {
        EditText principleInput = (EditText) findViewById(R.id.principleInput);
        EditText amortizationInput = (EditText) findViewById(R.id.amortizationInput);
        EditText interestInput = (EditText) findViewById(R.id.interestInput);
        TextView answer = (TextView) findViewById(R.id.answer);

        String principle = principleInput.getText().toString();
        String amortization = amortizationInput.getText().toString();
        String interest = interestInput.getText().toString();

        MortgageModel monthlyPayment = new MortgageModel(principle, amortization, interest);
        answer.setText(monthlyPayment.computePayment());
    }
}