package com.sanwei.sanwei.data;

import org.litepal.crud.DataSupport;

import java.util.Date;

/**
 * Created by tangdi on 12/13/17.
 */

public class English extends DataSupport{
    private float achievement;

    private Date date;

    public float getAchievement() {
        return achievement;
    }

    public void setAchievement(float achievement) {
        this.achievement = achievement;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
