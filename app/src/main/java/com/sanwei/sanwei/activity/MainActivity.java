package com.sanwei.sanwei.activity;

import android.os.Bundle;

import com.sanwei.sanwei.R;
import com.sanwei.sanwei.base.BaseActivity;
import com.sanwei.sanwei.mvp.component.DaggerMainActivityComponent;
import com.sanwei.sanwei.mvp.moudle.MainActivityMoudle;
import com.sanwei.sanwei.mvp.presenter.intface.IMainActivityPersenter;
import com.sanwei.sanwei.mvp.view.IMainActivityView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements IMainActivityView{

    @Inject
    IMainActivityPersenter mainActivityPersenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }

    @Override
    public void initMvp() {
        DaggerMainActivityComponent
                .builder()
                .mainActivityMoudle(new MainActivityMoudle(this))
                .build()
                .inject(this);
    }
}
