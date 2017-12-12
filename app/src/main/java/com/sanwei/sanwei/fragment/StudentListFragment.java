package com.sanwei.sanwei.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.sanwei.sanwei.R;
import com.sanwei.sanwei.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by tangdi on 12/11/17.
 */

public class StudentListFragment extends BaseFragment {
    @BindView(R.id.add_student)
    Button addStudent;
    @BindView(R.id.list_view)
    ListView listView;
    Unbinder unbinder;

    @Override
    public void initMvp() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.student_list_fragment, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.add_student)
    public void onViewClicked() {
    }
}
