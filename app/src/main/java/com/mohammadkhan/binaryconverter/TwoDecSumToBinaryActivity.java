package com.mohammadkhan.binaryconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Mohammad Khan
 * @version 1.0
 *
 * This class represents the activity screen where the user
 * inputs two decimal value and taps the "ADD" button in order
 * receive a binary value. When the user taps "ADD" the intent
 * is to have the two decimal values first summed, converted to
 * binary, and then provided to the user.
 *
 */
public class TwoDecSumToBinaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_to_sum_dec_two);

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

                // Adds the two decimal values and then converts their sum
                // into a it's binary string. The string is then parsed
                // as an integer.
                int decimalSum = decimal1 + decimal2;
                int binarySum = Integer.parseInt(Integer.toBinaryString(decimalSum));

                binarySumTextView.setText(binarySum + ""); // Outputs the binary sum to the user as a string.
            }
        });
    }
}
