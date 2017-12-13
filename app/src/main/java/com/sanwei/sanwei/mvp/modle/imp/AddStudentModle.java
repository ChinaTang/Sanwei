package com.sanwei.sanwei.mvp.modle.imp;

import android.database.sqlite.SQLiteDatabase;

import com.sanwei.sanwei.data.StudentSql;
import com.sanwei.sanwei.mvp.callback.AddCallBack;
import com.sanwei.sanwei.mvp.modle.intface.IAddStudentModle;

/**
 * Created by tangdi on 12/13/17.
 */

public class AddStudentModle implements IAddStudentModle{

    private SQLiteDatabase sqLiteDatabase;

    public AddStudentModle(SQLiteDatabase database){
        sqLiteDatabase = database;
    }

    @Override
    public void modleAddstudents(String name, String photo, String teacherName, AddCallBack addCallBack) {
        StudentSql studentSql = new StudentSql();
        studentSql.setName(name);
        studentSql.setTeacher(teacherName);
        studentSql.setPhoto(photo);
        boolean is = studentSql.save();
       addCallBack.addCallBack(studentSql.save());
    }
}
