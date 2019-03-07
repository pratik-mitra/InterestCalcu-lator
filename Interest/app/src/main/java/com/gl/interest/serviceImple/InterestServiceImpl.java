package com.gl.interest.serviceImple;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.gl.interest.service.InterestService;

public class InterestServiceImpl implements InterestService {

    private Double interest;

    public double calculateSimpleInterest(double amount, double rate, Integer year){

        interest = amount * rate * year / 100;
        return interest;
    }
    public double calculateCompoundInterest(double amount, double rate, Integer year){

        interest = amount * Math.pow((1 + rate / 100), year);
        return interest;
    }
}
