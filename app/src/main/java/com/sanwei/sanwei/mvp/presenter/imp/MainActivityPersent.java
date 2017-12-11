package com.sanwei.sanwei.mvp.presenter.imp;

import com.sanwei.sanwei.mvp.modle.intface.IMainActivityModle;
import com.sanwei.sanwei.mvp.presenter.intface.IMainActivityPersenter;
import com.sanwei.sanwei.mvp.view.IMainActivityView;

/**
 * Created by tangdi on 12/11/17.
 */

public class MainActivityPersent implements IMainActivityPersenter {

    private IMainActivityModle modle;

    private IMainActivityView view;

    public MainActivityPersent(IMainActivityModle modle, IMainActivityView view){
        this.modle = modle;
        this.view = view;
    }

}
