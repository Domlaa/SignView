package com.xning.signview.signdate;

import android.app.Application;
import org.litepal.LitePal;

public class SignApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
