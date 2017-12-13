package com.sanwei.sanwei.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.sanwei.sanwei.R;
import com.sanwei.sanwei.base.BaseActivity;
import com.sanwei.sanwei.fragment.CameraDialog;
import com.sanwei.sanwei.mvp.MvpHelp;
import com.sanwei.sanwei.mvp.component.DaggerAddStudentsComponent;
import com.sanwei.sanwei.mvp.moudle.AddStudentsMoudle;
import com.sanwei.sanwei.mvp.presenter.intface.IAddStudentsPersenter;
import com.sanwei.sanwei.mvp.view.IAddStudentView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by tangdi on 12/12/17.
 */

public class AddStudentActivity extends BaseActivity implements IAddStudentView{

    @Inject
    IAddStudentsPersenter persenter;

    @BindView(R.id.image_view)
    ImageView imageView;
    @BindView(R.id.edit_text)
    EditText editText;
    @BindView(R.id.ensure)
    Button ensure;

    @Override
    public void initMvp() {
        DaggerAddStudentsComponent
                .builder()
                .appComponent(MvpHelp.getInstance().getAppComponent())
                .addStudentsMoudle(new AddStudentsMoudle(this))
                .build()
                .inject(this);
    }

    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(R.layout.add_student_activity);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.image_view)
    public void onViewClicked() {
        CameraDialog cameraDialog = new CameraDialog();
        cameraDialog.show(getSupportFragmentManager(), "camerDialog");
    }

    @OnClick(R.id.ensure)
    public void ensuer() {
        persenter.addStudents(editText.getText().toString(), "", "");
    }
}
