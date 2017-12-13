package com.sanwei.sanwei.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sanwei.sanwei.R;
import com.sanwei.sanwei.data.StudentSql;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tangdi on 12/13/17.
 */

public class StudentListAdapter extends BaseAdapter {

    private List<StudentSql> source;

    public StudentListAdapter(List<StudentSql> source) {
        this.source = source;
    }

    @Override
    public int getCount() {
        return source.size();
    }

    @Override
    public Object getItem(int position) {
        return source.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHold;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
            viewHold = new ViewHolder(convertView);
            convertView.setTag(viewHold);
        }else{
            viewHold = (ViewHolder) convertView.getTag();
        }
        viewHold.studentImage.setImageResource(R.mipmap.ic_launcher);
        viewHold.studentName.setText(source.get(position).getName());
        viewHold.studentOwern.setText(source.get(position).getTeacher());
        return convertView;
    }


    static class ViewHolder {
        @BindView(R.id.student_image)
        ImageView studentImage;
        @BindView(R.id.student_name)
        TextView studentName;
        @BindView(R.id.student_owern)
        TextView studentOwern;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
