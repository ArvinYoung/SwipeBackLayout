package com.alex.swipebacklayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import github.alex.swipebacklayout.SwipeBackLayout;
import github.alex.util.ToastUtil;

public class SwipeBack2Activity extends AppCompatActivity implements View.OnClickListener {
    private SwipeBackLayout swipeBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_back2);
        swipeBackLayout = new SwipeBackLayout(this);
        findViewById(R.id.tv_1).setOnClickListener(this);
        findViewById(R.id.tv_2).setOnClickListener(this);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        swipeBackLayout.attachActivity(this);
    }

    @Override
    public void onClick(View view) {
        if (R.id.tv_1 == view.getId()) {
            swipeBackLayout.canSwipeBack(true);
            ToastUtil.shortCenter(App.getApp(), "允许滑动返回");
        } else if (R.id.tv_2 == view.getId()) {
            ToastUtil.shortCenter(App.getApp(), "不允许滑动返回");
            swipeBackLayout.canSwipeBack(false);
        }
    }
}
