package com.sanwei.sanwei.mvp.modle.intface;

import com.sanwei.sanwei.mvp.callback.AddCallBack;

/**
 * Created by tangdi on 12/13/17.
 */

public interface IAddStudentModle {
    void modleAddstudents(String name, String photo, String teacherName, AddCallBack addCallBack);
}
