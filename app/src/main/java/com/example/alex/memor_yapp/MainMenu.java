package com.example.alex.memor_yapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonCreateNew);
        button. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewMemory();
            }
        });

        button = (Button) findViewById(R.id.buttonAccessDiary);
        button. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDiary();
            }
        });
    }

    public void openNewMemory () {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity (intent);
    }

    public void openDiary () {
        Intent intent = new Intent (this, RecordingListActivity.class);
        startActivity(intent);
    }

}
