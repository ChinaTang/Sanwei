package com.sanwei.sanwei.mvp.component;

import com.sanwei.sanwei.activity.AddStudentActivity;
import com.sanwei.sanwei.mvp.ActivityScop;
import com.sanwei.sanwei.mvp.moudle.AddStudentsMoudle;

import dagger.Component;

/**
 * Created by tangdi on 12/13/17.
 */
@ActivityScop
@Component(modules = AddStudentsMoudle.class, dependencies = AppComponent.class)
public interface AddStudentsComponent {
    void inject(AddStudentActivity activity);
}
