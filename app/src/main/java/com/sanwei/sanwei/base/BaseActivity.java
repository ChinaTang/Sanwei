package com.sanwei.sanwei.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by tangdi on 12/11/17.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceBundle){
        super.onCreate(saveInstanceBundle);
        initMvp();
    }

    abstract public void initMvp();
}
