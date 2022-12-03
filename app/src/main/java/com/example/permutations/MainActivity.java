package com.example.permutations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private EditText inputTextNumber, inputTextNumber2;
    private TextView textViewResult;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button enterButton;
    //private int num1 = 1;
    //private int num2 = 1;
    PermutationsNumber permNum = new PermutationsNumber(1, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(this);
        inputTextNumber = (EditText) findViewById(R.id.inputTextNumber);
        inputTextNumber2 = (EditText) findViewById(R.id.inputTextNumber2);
        textViewResult = (TextView) findViewById(R.id.textview_result);
        enterButton = findViewById(R.id.button_result);
        RadioButton radioButtonSelection = findViewById(R.id.radio_one);
        RadioButton radioButtonSelection2 = findViewById(R.id.radio_two);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(inputTextNumber.getText().toString());
                int num2=Integer.parseInt(inputTextNumber2.getText().toString());
                permNum.setElementsNumber(num1);
                permNum.setPositionsNumber(num2);
                //textViewResult.setText(String.valueOf(result));
            }
        });

    }



    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //int elements = inputTextNumber;
        //int elements = 3;
        //int positions = 4;
        //PermutationsNumber permutationNumber = new PermutationsNumber(elements, positions);

        switch (i) {
            case R.id.radio_one:
                //int num1 = permutationNumber.withRepetitions(elements, positions);
                textViewResult.setText(String.valueOf(permNum.getWithoutRep()));

                break;
            case R.id.radio_two:
                //int num2 = permutationNumber.withoutRepetitions(elements, positions);
                textViewResult.setText(String.valueOf(permNum.getWithRep()));

        }

    }
}