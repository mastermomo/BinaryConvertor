package com.mohammadkhan.binaryconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addDecimalButton = (Button) findViewById(R.id.addDecimalButton); // Creates an object that stores the "Add" button.

        // Creates a click event when the user taps the "Add" button.
        addDecimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creates two objects that store the first and second decimal input
                // boxes respectively.
                EditText firstDecimalEditText = (EditText) findViewById(R.id.firstDecimalEditText);
                EditText secondDecimalEditText = (EditText) findViewById(R.id.secondDecimalEditText);

                TextView binarySumTextView = (TextView) findViewById(R.id.binarySumTextView); // Creates an object that stores the result text box.

                // Converts the string values given by the users in the first
                // and second input boxes to integers.
                int decimal1 = Integer.parseInt(firstDecimalEditText.getText().toString());
                int decimal2 = Integer.parseInt(secondDecimalEditText.getText().toString());

                int decimalSum = decimal1 + decimal2;
                int binarySum = Integer.parseInt(Integer.toBinaryString(decimalSum));
//                int remainderDecimal1 = 0;
//                for(int i = 0; decimal1 > 0; i++) {
//                    remainderDecimal1 = decimal1 % 2;
//                    decimal1 /= 2;
//                }
//
//                int remainderDecimal2 = 0;
//                for(int i = 0; decimal2 > 0; i++) {
//                    remainderDecimal2 = decimal2 % 2;
//                    decimal2 /= 2;
//                }
//                // Adds the two binary values and
//                // displays the their sum to the user.
//                int binarySum = remainderDecimal1 + remainderDecimal2;
                binarySumTextView.setText(binarySum + "");
            }
        });
    }
}
