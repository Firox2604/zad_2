package com.firox.pawel.zad_2_todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private ArrayList<ToDoElement> toDoList = new ArrayList<>();
    private ListView listView;
    private static CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_todo);
        taskLitInit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add_task:
                Log.d(TAG, "Add a new task");
                return true;
            case R.id.action_delete_task:
                Log.d(TAG, "Delete task");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void taskLitInit()
    {
        toDoList.add(new ToDoElement("zrobić zakupy do domu", Calendar.getInstance(),true));
        toDoList.add(new ToDoElement("wyprowadzić psa", Calendar.getInstance(),true));
        toDoList.add(new ToDoElement("odebrać dziecko ze szkoły", Calendar.getInstance(),true));

        adapter = new CustomAdapter(toDoList,this);
        listView.setAdapter(adapter);

    }
}
