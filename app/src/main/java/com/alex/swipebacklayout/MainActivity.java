package com.alex.swipebacklayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_1).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (R.id.tv_1 == view.getId()) {
            startActivity(new Intent(this, SwipeBackActivity.class));
        }
    }
}
