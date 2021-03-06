package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.island) TextView mIsland;
    @Bind(R.id.title) TextView mTitle;
    @Bind(R.id.find_madlibs_button) Button mfindMadLibsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mfindMadLibsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mfindMadLibsButton) {
            Intent intent = new Intent(MainActivity.this, MadlibsForm.class);
            startActivity(intent);
        }
    }
}
