package com.sanwei.sanwei.mvp.moudle;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.litepal.tablemanager.Connector;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangdi on 12/13/17.
 */
@Module
public class AppMoudle {

    private Application application;

    public AppMoudle(Application application){
        this.application = application;
    }

    @Singleton
    @Provides
    public Context provideContext(){
        return application;
    }

    @Singleton
    @Provides
    public SQLiteDatabase providesql(){
        return Connector.getDatabase();
    }
}
