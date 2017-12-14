package com.sanwei.sanwei.activity;

import com.beardedhen.androidbootstrap.TypefaceProvider;
import com.sanwei.sanwei.mvp.MvpHelp;
import com.sanwei.sanwei.mvp.component.AppComponent;
import com.sanwei.sanwei.mvp.component.DaggerAppComponent;
import com.sanwei.sanwei.mvp.moudle.AppMoudle;

import org.litepal.LitePalApplication;

/**
 * Created by tangdi on 12/13/17.
 */

public class AppApplication extends LitePalApplication {

    private AppComponent appComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        TypefaceProvider.registerDefaultIconSets();
        initMvp();
        MvpHelp.getInstance().setAppComponent(appComponent);
    }

    private void initMvp(){
        appComponent = DaggerAppComponent
                .builder()
                .appMoudle(new AppMoudle(this))
                .build();
    }

}
