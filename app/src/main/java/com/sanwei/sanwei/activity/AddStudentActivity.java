package com.sanwei.sanwei.activity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.sanwei.sanwei.R;
import com.sanwei.sanwei.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by tangdi on 12/12/17.
 */

public class AddStudentActivity extends BaseActivity {
    @BindView(R.id.image_view)
    ImageView imageView;
    @BindView(R.id.edit_text)
    EditText editText;

    @Override
    public void initMvp() {

    }

    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(R.layout.add_student_activity);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.image_view)
    public void onViewClicked() {
    }
}
