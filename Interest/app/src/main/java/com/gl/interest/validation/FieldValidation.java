package com.gl.interest.validation;

import android.content.Context;
import android.widget.Toast;

public class FieldValidation {

    public static boolean validateField(String amount, String rate, String year, Context main){

            if (amount.isEmpty()) {
                Toast t = Toast.makeText(main, "please enter amount", Toast.LENGTH_SHORT);
                t.show();
                return false;
            }
            if (rate.isEmpty()) {
                Toast t = Toast.makeText(main, "please enter rate", Toast.LENGTH_SHORT);
                t.show();
                return false;
            }
            if (year.isEmpty()) {
                Toast t = Toast.makeText(main, "please enter year", Toast.LENGTH_SHORT);
                t.show();
                return false;
            }

            return true;
    }

}
