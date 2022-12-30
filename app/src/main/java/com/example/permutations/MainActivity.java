package com.example.permutations;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText inputTextNumber, inputTextNumber2;
    private TextView textViewResult;
    public RadioGroup radioGroup;
    public Button enterButton;
    PermutationsNumber permNum = new PermutationsNumber(1, 1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radioGroup);
        inputTextNumber = findViewById(R.id.inputTextNumber);
        //inputTextNumber.setSelection(inputTextNumber.length()); //place the cursor at right?
        //https://stackoverflow.com/questions/6217378/place-cursor-at-the-end-of-text-in-edittext
        inputTextNumber2 = findViewById(R.id.inputTextNumber2);
        textViewResult = findViewById(R.id.textview_result);
        enterButton = findViewById(R.id.button_result);
        RadioButton radioButtonSelection = findViewById(R.id.radio_one);
        enterButton.setOnClickListener(view -> {
            int num1=Integer.parseInt(inputTextNumber.getText().toString());
            int num2=Integer.parseInt(inputTextNumber2.getText().toString());
            permNum.setElementsNumber(num1);
            permNum.setPositionsNumber(num2);

            if (radioButtonSelection.isChecked()) {
                if (num1 < num2) {
                    textViewResult.setText("n < k !!!");} else {
                    textViewResult.setText(String.valueOf(permNum.getWithoutRep()));
                }
            } else {
                textViewResult.setText(String.valueOf(permNum.getWithRep()));
            }
        });
    }
}