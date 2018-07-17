package com.will.weighingmeterviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1;

    private Button button2;

    private WeighingMeterView weighing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);

        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(this);

        button2.setOnClickListener(this);

        weighing = findViewById(R.id.weighing);

//        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                weighing.setPercentData(200,new DecelerateInterpolator());
                break;

            case R.id.button2:
                weighing.setPercentData(0,new DecelerateInterpolator());
                break;
        }
    }
}
