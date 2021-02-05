package com.ba.patterns.frontcontroller;

public class Dispatching {
    private StudentView studentView;
    private TeacherView teacherView;

    public Dispatching()
    {
        studentView = new StudentView();
        teacherView = new TeacherView();
    }

    public void dispatch(String request)
    {
        if(request.equalsIgnoreCase("Student"))
        {
            studentView.display();
        }
        else
        {
            teacherView.display();
        }
    }
}
