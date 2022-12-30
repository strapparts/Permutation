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
    public RadioGroup radioGroupRep, radioGroupOrder;
    public Button enterButton;
    PermutationsNumber permNum = new PermutationsNumber(1, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroupRep=findViewById(R.id.radioGroupRepetition);
        radioGroupOrder=findViewById(R.id.radioGroupOrder);
        inputTextNumber = findViewById(R.id.inputTextNumber);
        inputTextNumber.setSelection(inputTextNumber.getText().length()); //place the cursor at right?
        inputTextNumber2 = findViewById(R.id.inputTextNumber2); //place the cursor at right?
        //https://stackoverflow.com/questions/6217378/place-cursor-at-the-end-of-text-in-edittext
        inputTextNumber2.setSelection(inputTextNumber.getText().length());
        textViewResult = findViewById(R.id.textview_result);
        enterButton = findViewById(R.id.button_result);
        RadioButton radioWithoutRep = findViewById(R.id.radio_without_rep);
        RadioButton radioWithRep = findViewById(R.id.radio_with_rep);
        RadioButton radioWithOrder = findViewById(R.id.radio_with_order);
        RadioButton radioWithoutOrder = findViewById(R.id.radio_without_order);
        enterButton.setOnClickListener(view -> {
            int num1=Integer.parseInt(inputTextNumber.getText().toString());
            int num2=Integer.parseInt(inputTextNumber2.getText().toString());
            permNum.setElementsNumber(num1);
            permNum.setPositionsNumber(num2);

            if (radioWithoutRep.isChecked() && radioWithOrder.isChecked()){
                if (num1 < num2) {
                    textViewResult.setText("n < k !!!");} else {
                    textViewResult.setText(String.valueOf(permNum.getWithoutRep()));
                }
            } else if (radioWithRep.isChecked() && radioWithOrder.isChecked()) {
                textViewResult.setText(String.valueOf(permNum.getWithRep()));
            } else if (radioWithoutRep.isChecked() && radioWithoutOrder.isChecked()){
                if (num1 < num2) {
                    textViewResult.setText("n < k !!!");} else {
                    textViewResult.setText(String.valueOf(permNum.getWithoutRepWithoutOrder()));
                }
            } else if (radioWithRep.isChecked() && radioWithoutOrder.isChecked()){
                textViewResult.setText(String.valueOf(permNum.getWithRepWithoutOrder()));
            }
        });
    }
}