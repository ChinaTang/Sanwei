package com.sanwei.sanwei.mvp.callback;

import com.sanwei.sanwei.data.StudentSql;

import java.util.List;

/**
 * Created by tangdi on 12/13/17.
 */

public interface InitViewCallBack {
    void callBack(List<StudentSql> list);
}
