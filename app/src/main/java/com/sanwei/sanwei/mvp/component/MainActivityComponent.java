package com.sanwei.sanwei.mvp.component;

import com.sanwei.sanwei.activity.MainActivity;
import com.sanwei.sanwei.mvp.ActivityScop;
import com.sanwei.sanwei.mvp.moudle.MainActivityMoudle;

import dagger.Component;

/**
 * Created by tangdi on 12/11/17.
 */
@ActivityScop
@Component(modules = MainActivityMoudle.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
