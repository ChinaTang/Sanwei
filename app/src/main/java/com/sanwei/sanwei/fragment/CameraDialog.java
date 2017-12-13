package com.sanwei.sanwei.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sanwei.sanwei.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by tangdi on 12/12/17.
 */

public class CameraDialog extends DialogFragment {
    @BindView(R.id.camera)
    TextView camera;
    @BindView(R.id.photo)
    TextView photo;
    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.camera_select_dialog, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.camera, R.id.photo})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.camera:
                break;
            case R.id.photo:
                break;
        }
    }
}
