package com.sanwei.sanwei.mvp;

import com.sanwei.sanwei.mvp.component.AppComponent;

/**
 * Created by tangdi on 12/13/17.
 */

public class MvpHelp {
    private MvpHelp(){}

    private static MvpHelp _instance = null;

    private AppComponent appComponent;

    public static MvpHelp getInstance(){
        if(_instance == null){
            _instance = new MvpHelp();
        }
        return _instance;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }
}
