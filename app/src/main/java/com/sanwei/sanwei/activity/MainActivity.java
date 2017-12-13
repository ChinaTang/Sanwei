package com.sanwei.sanwei.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Button;

import com.sanwei.sanwei.R;
import com.sanwei.sanwei.adapter.ViewPageAdapter;
import com.sanwei.sanwei.base.BaseActivity;
import com.sanwei.sanwei.mvp.component.DaggerMainActivityComponent;
import com.sanwei.sanwei.mvp.moudle.MainActivityMoudle;
import com.sanwei.sanwei.mvp.presenter.intface.IMainActivityPersenter;
import com.sanwei.sanwei.mvp.view.IMainActivityView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements IMainActivityView {

    @Inject
    IMainActivityPersenter mainActivityPersenter;
    @BindView(R.id.view_page)
    ViewPager viewPage;
    @BindView(R.id.bn01)
    Button bn01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        ButterKnife.bind(this);
        viewPage.setAdapter(new ViewPageAdapter(getSupportFragmentManager()));
    }

    @Override
    public void initMvp() {
        DaggerMainActivityComponent
                .builder()
                .mainActivityMoudle(new MainActivityMoudle(this))
                .build()
                .inject(this);
    }

    @OnClick(R.id.bn01)
    public void onViewClicked() {
    }
}
