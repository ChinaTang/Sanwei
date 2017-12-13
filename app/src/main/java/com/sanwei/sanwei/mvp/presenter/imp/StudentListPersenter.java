package com.sanwei.sanwei.mvp.presenter.imp;

import com.sanwei.sanwei.data.StudentSql;
import com.sanwei.sanwei.mvp.callback.InitViewCallBack;
import com.sanwei.sanwei.mvp.modle.intface.IStudentListModle;
import com.sanwei.sanwei.mvp.presenter.intface.IStudentListPersenter;
import com.sanwei.sanwei.mvp.view.IStudentListView;

import java.util.List;

/**
 * Created by tangdi on 12/13/17.
 */

public class StudentListPersenter implements IStudentListPersenter{
    private IStudentListView view;
    private IStudentListModle modle;
    public StudentListPersenter (IStudentListView view, IStudentListModle modle){
        this.view = view;
        this.modle = modle;
    }

    @Override
    public void initViewData() {
        modle.initView(new InitViewCallBack() {
            @Override
            public void callBack(List<StudentSql> list) {
                view.initView(list);
            }
        });
    }
}
