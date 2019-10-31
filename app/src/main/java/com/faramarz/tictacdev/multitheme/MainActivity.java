package com.faramarz.tictacdev.multitheme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    Switch switchTheme;
    SharedPref sharedPref;
    SharedPreferences pref;
    String Mypre = "Save";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPref = new SharedPref(this);
        if (sharedPref.loadNightMode()) {
            setTheme(R.style.DarkAppTheme);
        } else {
            setTheme(R.style.AppTheme);
        }

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        pref = getSharedPreferences(Mypre, 0);
        switchTheme = findViewById(R.id.switchTheme);

        switchTheme.setOnCheckedChangeListener(this);
        nightMode();

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (isChecked) {
            setTheme(R.style.DarkAppTheme);
        } else {
            setTheme(R.style.AppTheme);
        }
    }

    void nightMode() {
        if (sharedPref.loadNightMode()) {
            switchTheme.setChecked(true);

        }

        switchTheme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedPref.setNightMode(true);
                    recreate();
                } else {
                    sharedPref.setNightMode(false);
                    recreate();
                }
            }

        });
    }


    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }


}
