package com.mgk.action;

import com.mgk.entity.Person;
import com.mgk.entity.Robot;
import com.mgk.listener.impl.MyPersonListener;
import com.mgk.listener.impl.MyRobotListener;

public class TestListener {

    public static void main(String[] args) {
     /*   Robot robot = new Robot();
        robot.registerListener(new MyRobotListener());
        robot.working();
        robot.dancing();*/
        Person p = new Person();
        p.registerListener(new MyPersonListener());
        p.work();
    }
}