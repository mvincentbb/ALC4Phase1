package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAboutButtonClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), AboutActivity.class);
        startActivity(myIntent);
    }
    public void onMyProfileButtonClick(View v) {
        Intent myIntent2 = new Intent(getBaseContext(), MyProfileActivity.class);
        startActivity(myIntent2);
    }
}
