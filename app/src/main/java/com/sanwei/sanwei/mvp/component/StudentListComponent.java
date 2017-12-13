package com.sanwei.sanwei.mvp.component;

import com.sanwei.sanwei.fragment.StudentListFragment;
import com.sanwei.sanwei.mvp.ActivityScop;
import com.sanwei.sanwei.mvp.moudle.StudentListMoudle;

import dagger.Component;

/**
 * Created by tangdi on 12/13/17.
 */
@ActivityScop
@Component(modules = StudentListMoudle.class, dependencies = AppComponent.class)
public interface StudentListComponent {
    void inject(StudentListFragment fragment);
}
