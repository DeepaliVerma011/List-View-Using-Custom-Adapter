package com.example.listviewusingcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Teacher> teachers= Teacher.get8RandomTeachers();
ListView lvteachers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvteachers= findViewById(R.id.lvteachers);
        TeacherAdapter teacherAdapter= new TeacherAdapter();
        lvteachers.setAdapter(teacherAdapter);
    }

    //Custom Adapter is used when we have 2 contents inside single item.using Base Adapter class

    class TeacherAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return teachers.size();
        }

        @Override
        public Teacher getItem(int position) {
            return teachers.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        //returns a itemview for which we  have to create a itemview and then return it
        public View getView(int position, View convertView, ViewGroup parent) {
            //creating a item view
            View itemView= getLayoutInflater().inflate(
                   R.layout.list_item_teachers,
                    parent,
                    false
            );

            //returning

            TextView tvName = itemView.findViewById(R.id.tvName);
            TextView tvCourse= itemView.findViewById(R.id.tvCourse);
            tvName.setText(getItem(position).getName());
            tvCourse.setText(getItem(position).getCourse());
            return itemView;
        }
    }
}