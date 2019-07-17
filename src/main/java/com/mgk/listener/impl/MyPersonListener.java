package com.mgk.listener.impl;

import com.mgk.entity.Person;
import com.mgk.event.Even;
import com.mgk.listener.PersonListener;

public class MyPersonListener implements PersonListener {

    @Override
    public void work(Even even) {
        Person p =   (Person)even.getRobot();
        System.out.println("工作");
    }

    @Override
    public void exercise(Even even) {
        Person p =   (Person)even.getRobot();
        System.out.println("运动");
    }

    @Override
    public void sing(Even even) {
        Person p =   (Person)even.getRobot();
        System.out.println("唱歌");
    }
}
