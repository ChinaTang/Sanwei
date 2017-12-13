package com.sanwei.sanwei.data;

import org.litepal.crud.DataSupport;

/**
 * Created by tangdi on 12/13/17.
 */

public class StudentSql extends DataSupport{
    private String name;
    private String teacher;
    private String photo;

    private Chinese chinese;

    private English english;

    private Math math;

    public Chinese getChinese() {
        return chinese;
    }

    public void setChinese(Chinese chinese) {
        this.chinese = chinese;
    }

    public English getEnglish() {
        return english;
    }

    public void setEnglish(English english) {
        this.english = english;
    }

    public Math getMath() {
        return math;
    }

    public void setMath(Math math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
