package com.sanwei.sanwei.mvp.component;

import android.database.sqlite.SQLiteDatabase;

import com.sanwei.sanwei.mvp.moudle.AppMoudle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tangdi on 12/13/17.
 */
@Singleton
@Component(modules = AppMoudle.class)
public interface AppComponent {
    SQLiteDatabase getSQL();
}
