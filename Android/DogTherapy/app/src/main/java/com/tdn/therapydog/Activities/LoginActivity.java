package com.tdn.therapydog.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.tdn.therapydog.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initViews();
    }

    private void initViews(){
        ((Button)findViewById(R.id.humanButton)).setOnClickListener(this);
        ((Button)findViewById(R.id.canineButton)).setOnClickListener(this);
    }

    private void startHumanActivity(){

        startActivity(new Intent(this, HumanHomeActivity.class));
    }

    private void startCanineActivity(){

        startActivity(new Intent(this, CanineHomeActivity.class));
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.humanButton:
                startHumanActivity();
                break;

            case R.id.canineButton:
                startCanineActivity();
                break;
        }

    }
}
