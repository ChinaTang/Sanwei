package com.sanwei.sanwei.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.beardedhen.androidbootstrap.AwesomeTextView;
import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapCircleThumbnail;
import com.sanwei.sanwei.R;
import com.sanwei.sanwei.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by tangdi on 12/14/17.
 */

public class StudentsDetailActivity extends BaseActivity {


    @BindView(R.id.update)
    BootstrapButton update;
    @BindView(R.id.student_photo)
    BootstrapCircleThumbnail studentPhoto;
    @BindView(R.id.student_name)
    AwesomeTextView studentName;
    @BindView(R.id.teacher_name)
    AwesomeTextView teacherName;
    @BindView(R.id.chiness)
    Button chiness;
    @BindView(R.id.math)
    Button math;
    @BindView(R.id.english)
    Button english;
    @BindView(R.id.chart)
    Button chart;
    @BindView(R.id.student_achievement)
    ViewPager studentAchievement;

    @Override
    public void initMvp() {

    }

    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(R.layout.studen_detail);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.update, R.id.chiness, R.id.math, R.id.english, R.id.chart})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.update:
                break;
            case R.id.chiness:
                break;
            case R.id.math:
                break;
            case R.id.english:
                break;
            case R.id.chart:
                break;
        }
    }
}
