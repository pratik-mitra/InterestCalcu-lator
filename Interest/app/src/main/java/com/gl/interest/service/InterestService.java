package com.gl.interest.service;

import android.widget.Button;

public interface InterestService {

    double calculateSimpleInterest(double amount, double rate, Integer year);
    double calculateCompoundInterest(double amount, double rate, Integer year);
}
