package com.sanwei.sanwei.mvp.modle.imp;

import android.database.sqlite.SQLiteDatabase;

import com.sanwei.sanwei.data.StudentSql;
import com.sanwei.sanwei.mvp.callback.InitViewCallBack;
import com.sanwei.sanwei.mvp.modle.intface.IStudentListModle;

import org.litepal.crud.DataSupport;

/**
 * Created by tangdi on 12/13/17.
 */

public class StudentListModle implements IStudentListModle{
    private SQLiteDatabase sqLiteDatabase;

    public StudentListModle (SQLiteDatabase sqLiteDatabase){
        this.sqLiteDatabase = sqLiteDatabase;
    }

    @Override
    public void initView(InitViewCallBack callBack) {
        callBack.callBack(DataSupport.findAll(StudentSql.class));
    }
}
