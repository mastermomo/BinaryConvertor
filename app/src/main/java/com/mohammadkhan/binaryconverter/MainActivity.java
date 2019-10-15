package com.mohammadkhan.binaryconverter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Mohammad Khan
 * @version 1.0
 *
 * This class represents the activity screen where the user
 * can navigate to other activity screen used with the intent of solving
 * different problems involving decimals and binary numbers.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sumTwoBinaryToBinaryButton = (Button) findViewById(R.id.sumTwoBinaryToBinaryButton); // Creates an object that stores the "Sum of Two Decimal Numbers to Binary" button.

        // Creates a click event when the user taps the "Sum of Two Decimal Numbers to Binary" button.
        sumTwoBinaryToBinaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creates an Intent object that is then used to
                // navigate to the TwoDecSumToBinaryActivity class
                // when the user taps on the button.
                Intent startIntent = new Intent(getApplicationContext(), TwoDecSumToBinaryActivity.class);
                startActivity(startIntent);
            }
        });

        Button googleSearchBinaryButton = (Button) findViewById(R.id.googleSearchBinaryButton); // Creates an object that stores the "Tap Me To Learn More About Binary Numbers!" button.

        // Creates a click event when the user taps the "Tap Me To Learn More About Binary Numbers!" button.
        googleSearchBinaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://www.mathsisfun.com/binary-number-system.html"; // Intializes a string with a web link.
                Uri webaddress = Uri.parse(link); // Parses the web link in order to go to in another application (browser).

                // Creates an Intent object that is then used to
                // navigate to the web link in question
                // when the user taps on the button.
                Intent learnBinaryPage = new Intent(Intent.ACTION_VIEW, webaddress);
                startActivity(learnBinaryPage);
            }
        });
    }
}
