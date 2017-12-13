package com.sanwei.sanwei.mvp.moudle;

import android.database.sqlite.SQLiteDatabase;

import com.sanwei.sanwei.mvp.ActivityScop;
import com.sanwei.sanwei.mvp.modle.imp.AddStudentModle;
import com.sanwei.sanwei.mvp.modle.intface.IAddStudentModle;
import com.sanwei.sanwei.mvp.presenter.imp.AddStudentsPersenter;
import com.sanwei.sanwei.mvp.presenter.intface.IAddStudentsPersenter;
import com.sanwei.sanwei.mvp.view.IAddStudentView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangdi on 12/13/17.
 */
@Module
public class AddStudentsMoudle {
    private IAddStudentView view;

    public AddStudentsMoudle(IAddStudentView view){
        this.view = view;
    }

    @ActivityScop
    @Provides
    public IAddStudentModle provideModle(SQLiteDatabase sqLiteDatabase){
        return new AddStudentModle(sqLiteDatabase);
    }

    @ActivityScop
    @Provides
    public IAddStudentView provideView(){
        return view;
    }

    @ActivityScop
    @Provides
    public IAddStudentsPersenter providePersenter(IAddStudentModle modle, IAddStudentView view){
        return new AddStudentsPersenter(modle, view);
    }
}
