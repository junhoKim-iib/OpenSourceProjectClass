package com.cookandroid.mission8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CustomerActivity extends AppCompatActivity {
	TextView titleText;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        titleText = findViewById(R.id.titleText);

        // process received intent
        Intent receivedIntent = getIntent();
        String titleMsg = receivedIntent.getStringExtra("titleMsg");

        Toast.makeText(this, "titleMsg : " + titleMsg, Toast.LENGTH_LONG).show();

        if (titleText != null) {
        	titleText.setText(titleMsg);
        }


        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		Intent resultIntent = new Intent();
                resultIntent.putExtra("message", "result message is OK!");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
        	}
        });

    }

}
