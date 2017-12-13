package com.sanwei.sanwei.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.sanwei.sanwei.R;
import com.sanwei.sanwei.activity.AddStudentActivity;
import com.sanwei.sanwei.adapter.StudentListAdapter;
import com.sanwei.sanwei.base.BaseFragment;
import com.sanwei.sanwei.data.StudentSql;
import com.sanwei.sanwei.mvp.MvpHelp;
import com.sanwei.sanwei.mvp.component.DaggerStudentListComponent;
import com.sanwei.sanwei.mvp.moudle.StudentListMoudle;
import com.sanwei.sanwei.mvp.presenter.intface.IStudentListPersenter;
import com.sanwei.sanwei.mvp.view.IStudentListView;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by tangdi on 12/11/17.
 */

public class StudentListFragment extends BaseFragment implements IStudentListView{
    @BindView(R.id.add_student)
    Button addStudent;
    @BindView(R.id.list_view)
    ListView listView;
    Unbinder unbinder;

    @Inject
    IStudentListPersenter persenter;

    private StudentListAdapter adapter;

    @Override
    public void initMvp() {
        DaggerStudentListComponent
                .builder()
                .appComponent(MvpHelp.getInstance().getAppComponent())
                .studentListMoudle(new StudentListMoudle(this))
                .build()
                .inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.student_list_fragment, container, false);
        unbinder = ButterKnife.bind(this, view);
        initData();
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.add_student)
    public void onViewClicked() {
        Intent intent = new Intent(getActivity(), AddStudentActivity.class);
        startActivity(intent);
    }

    public void initData(){
        persenter.initViewData();
    }

    @Override
    public void initView(List<StudentSql> list) {
        if(list != null){
            adapter = new StudentListAdapter(list);
            listView.setAdapter(adapter);
        }
    }
}
