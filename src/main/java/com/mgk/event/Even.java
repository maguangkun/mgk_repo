package com.mgk.event;

import com.mgk.entity.Robot;

/**
 * 事件对象
 */
public class Even<T> {

    private T robot;

    public Even(){
        super();
    }
    public Even(T robot){
        super();
        this.robot = robot;
    }


    public T getRobot() {
        return robot;
    }

    public void setRobot(T robot) {
        this.robot = robot;
    }
}