package com.mgk.listener;

import com.mgk.event.Even;

public interface PersonListener {
    public void work(Even even);
    public void exercise(Even even);
    public void sing(Even even);
}
