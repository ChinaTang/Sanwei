package com.sanwei.sanwei.mvp.moudle;

import com.sanwei.sanwei.mvp.ActivityScop;
import com.sanwei.sanwei.mvp.modle.imp.MainActivityModle;
import com.sanwei.sanwei.mvp.modle.intface.IMainActivityModle;
import com.sanwei.sanwei.mvp.presenter.imp.MainActivityPersent;
import com.sanwei.sanwei.mvp.presenter.intface.IMainActivityPersenter;
import com.sanwei.sanwei.mvp.view.IMainActivityView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangdi on 12/11/17.
 */
@Module
public class MainActivityMoudle {
    private IMainActivityView view;
    public MainActivityMoudle(IMainActivityView view){
        this.view = view;
    }

    @ActivityScop
    @Provides
    public IMainActivityView provideView(){
        return view;
    }

    @ActivityScop
    @Provides
    public IMainActivityModle provideModle(){
        return new MainActivityModle();
    }

    @ActivityScop
    @Provides
    public IMainActivityPersenter providePresenter(IMainActivityView view, IMainActivityModle modle){
        return new MainActivityPersent(modle, view);
    }
}
