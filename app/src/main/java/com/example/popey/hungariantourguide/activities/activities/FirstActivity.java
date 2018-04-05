package com.example.popey.hungariantourguide.activities.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.popey.hungariantourguide.R;

public class FirstActivity extends AppCompatActivity {
    Button startButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Set the content of the activity to use the first_activity.xml layout file
         */
        setContentView(R.layout.first_activity);

        /**
         * StartButton click.
         */
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(start);
            }
        });


    }
}