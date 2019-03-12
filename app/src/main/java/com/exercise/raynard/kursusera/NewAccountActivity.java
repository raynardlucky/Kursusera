package com.exercise.raynard.kursusera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
    }

    public void toBottomNav(View view) {
        Intent intent = new Intent(this,BottomNavigationActivity.class);
        startActivity(intent);
    }
}
