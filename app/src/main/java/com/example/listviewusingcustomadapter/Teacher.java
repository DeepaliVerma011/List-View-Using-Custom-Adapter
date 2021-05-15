package com.example.listviewusingcustomadapter;

import java.util.ArrayList;

public class Teacher {
    String name;
    String course;

    public Teacher(String name,String course){
        this.name=name;
        this.course=course;
    }
    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

    //array list of type Teacher with name teachers
    public static ArrayList<Teacher>get8RandomTeachers(){
        ArrayList<Teacher>  teachers= new ArrayList<>();
        teachers.add(new Teacher("Abdul bari","c++"));
        teachers.add(new Teacher("Abdul bari","c++"));
        teachers.add(new Teacher("Abdul bari","c++"));
        teachers.add(new Teacher("Abdul bari","c++"));
        teachers.add(new Teacher("Abdul bari","c++"));
        teachers.add(new Teacher("Abdul bari","c++"));
        teachers.add(new Teacher("Abdul bari","c++"));
        teachers.add(new Teacher("Abdul bari","c++"));

        return teachers;
    }

}
