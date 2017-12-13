package com.sanwei.sanwei.mvp.view;

import com.sanwei.sanwei.data.StudentSql;

import java.util.List;

/**
 * Created by tangdi on 12/13/17.
 */

public interface IStudentListView {
    void initView(List<StudentSql> list);
}
