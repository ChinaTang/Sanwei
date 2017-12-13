package com.sanwei.sanwei.mvp.presenter.imp;

import com.sanwei.sanwei.mvp.callback.AddCallBack;
import com.sanwei.sanwei.mvp.modle.intface.IAddStudentModle;
import com.sanwei.sanwei.mvp.presenter.intface.IAddStudentsPersenter;
import com.sanwei.sanwei.mvp.view.IAddStudentView;

/**
 * Created by tangdi on 12/13/17.
 */

public class AddStudentsPersenter implements IAddStudentsPersenter{
    private IAddStudentModle modle;

    private IAddStudentView view;

    public AddStudentsPersenter(IAddStudentModle modle, IAddStudentView view){
        this.modle = modle;
        this.view = view;
    }


    @Override
    public void addStudents(String name, String photo, String teachername) {
        modle.modleAddstudents(name, photo, teachername, new AddCallBack() {
            @Override
            public void addCallBack(boolean is) {

            }
        });
    }


}
