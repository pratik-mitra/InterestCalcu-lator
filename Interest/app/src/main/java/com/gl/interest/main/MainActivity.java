package com.gl.interest.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.gl.interest.R;
import com.gl.interest.service.InterestService;
import com.gl.interest.serviceImple.InterestServiceImpl;
import com.gl.interest.validation.FieldValidation;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private EditText amountText;
    private EditText yearText;
    private EditText rateText;
    private EditText resultText;

    private Button simpleInterestButton;
    private Button compoundInterestButton;

    private Double amount;
    private Double rate;
    private Integer year;

    InterestService interestService = new InterestServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeElements();

        simpleInterestButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        boolean isValid = true;
                        isValid = FieldValidation.validateField(amountText.getText().toString(), yearText.getText().toString(),
                                rateText.getText().toString(), getApplicationContext());
                        if(isValid) {
                            amount = Double.parseDouble(amountText.getText().toString());
                            rate = Double.parseDouble(rateText.getText().toString());
                            year = Integer.parseInt(yearText.getText().toString());
                            Double simpleInterest = interestService.calculateSimpleInterest(amount, rate, year);
                            resultText.setText(simpleInterest.toString());
                            Log.v(TAG, "index=" + simpleInterest);
                        }
                    }
                });

        compoundInterestButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        boolean isValid = true;
                        isValid = FieldValidation.validateField(amountText.getText().toString(), yearText.getText().toString(),
                                rateText.getText().toString(), getApplicationContext());
                        if(isValid) {
                            amount = Double.parseDouble(amountText.getText().toString());
                            rate = Double.parseDouble(rateText.getText().toString());
                            year = Integer.parseInt(yearText.getText().toString());
                            Double compoundInterest = interestService.calculateCompoundInterest(amount, rate, year);
                            resultText.setText(compoundInterest.toString());
                            Log.v(TAG, "index=" + compoundInterest);
                        }
                    }
                });


    }

    private void initializeElements(){

        simpleInterestButton = (Button) findViewById(R.id.button1);
        compoundInterestButton = (Button) findViewById(R.id.button2);

        amountText = (EditText) findViewById(R.id.editText1);
        yearText = (EditText) findViewById(R.id.editText2);
        rateText = (EditText) findViewById(R.id.editText3);
        resultText = (EditText) findViewById(R.id.editText4);
    }

}
