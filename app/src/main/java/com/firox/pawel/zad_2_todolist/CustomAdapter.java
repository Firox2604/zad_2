package com.firox.pawel.zad_2_todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ToDoElement> implements View.OnClickListener {

    private ArrayList<ToDoElement> dataSet;
    Context mContext;

    private static class ViewHolder {
        TextView txtTitle;
        TextView txtTime;
        CheckBox isDoneCheckbox;
    }

    public CustomAdapter(ArrayList<ToDoElement> data, Context context) {
        super(context, R.layout.item_todo_template, data);
        this.dataSet = data;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ToDoElement toDoElement = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_todo_template, parent, false);
            viewHolder.txtTime = convertView.findViewById(R.id.date_time_text_view);
            viewHolder.txtTitle = convertView.findViewById(R.id.task_title);
            viewHolder.isDoneCheckbox = convertView.findViewById(R.id.checkBox);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.txtTime.setText(toDoElement.getTime());
        viewHolder.txtTitle.setText(toDoElement.getTitle());
        viewHolder.isDoneCheckbox.setSelected(toDoElement.getTaskCompleted());
        return convertView;

    }

    @Override
    public void onClick(View v) {

    }
}
