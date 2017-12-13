package com.sanwei.sanwei.mvp.moudle;

import android.database.sqlite.SQLiteDatabase;

import com.sanwei.sanwei.mvp.ActivityScop;
import com.sanwei.sanwei.mvp.modle.imp.StudentListModle;
import com.sanwei.sanwei.mvp.modle.intface.IStudentListModle;
import com.sanwei.sanwei.mvp.presenter.imp.StudentListPersenter;
import com.sanwei.sanwei.mvp.presenter.intface.IStudentListPersenter;
import com.sanwei.sanwei.mvp.view.IStudentListView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangdi on 12/13/17.
 */
@Module
public class StudentListMoudle {

    private IStudentListView view;

    public StudentListMoudle(IStudentListView view){
        this.view = view;
    }

    @ActivityScop
    @Provides
    public IStudentListView provideView(){
        return view;
    }

    @ActivityScop
    @Provides
    public IStudentListModle provideModle(SQLiteDatabase sqLiteDatabase){
        return new StudentListModle(sqLiteDatabase);
    }

    @ActivityScop
    @Provides
    public IStudentListPersenter providePersenter(IStudentListModle modle, IStudentListView view){
        return new StudentListPersenter(view, modle);
    }

}
