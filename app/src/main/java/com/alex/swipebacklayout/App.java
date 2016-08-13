package com.alex.swipebacklayout;

import android.app.Application;

import github.alex.helper.CrashHandler;

/**
 * 作者：alex
 * 时间：2016/8/12 16:12
 * 博客地址：http://www.jianshu.com/users/c3c4ea133871/subscriptions
 */
public class App extends Application {
    public static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        new CrashHandler(this);
    }

    public static Application getApp() {
        return application;
    }
}
