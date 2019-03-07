package com.gl.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String name;
    private String age;
    private String degree;

    private Button saveButton;
    private Button resetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton = (Button) findViewById(R.id.button1);

        saveButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {

                        name = ((EditText) findViewById(R.id.editText1)).getText().toString();
                        age = ((Spinner) findViewById(R.id.planets_spinner)).getSelectedItem().toString();
                        degree = ((EditText) findViewById(R.id.editText3)).getText().toString();

                        String infoText = name + "     " + age + "     " + degree;

                        TextView mText = (TextView) findViewById(R.id.textView4);
                        mText.setText(infoText);
                    }
                });

        resetButton = (Button) findViewById(R.id.button2);
        resetButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        ((EditText) findViewById(R.id.editText1)).getText().clear();
                        ((EditText) findViewById(R.id.editText3)).getText().clear();

                    }
                }
        );

    }
}
