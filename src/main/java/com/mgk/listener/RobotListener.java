package com.mgk.listener;

import com.mgk.event.Even;

/**
 * 事件监听器
 */
public interface RobotListener {

    public void working(Even even);
    public void dancing(Even even);

}